// In satellite signal processing a stream of N data packets is received. Each packet i is classified into a category A[i] (rangi om 0 to C-1) and carries a specific signal weight W[i] representing its data density. 
// A monitoring window [1, r) (the contiguous range of packets from index I to r) is considered frequency-balanced if there is at least one category that appears in strictly more than half of the packets in that window . In other words, some category is a strict majority in the window. 
// Find the maximum total weight (the sum of W[i] for all packen the window) over all possible frequency-balanced windows.


// import java.util.Scanner;

// public class satelliteDataStream {
//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter n:");
//         int n = ip.nextInt();

//         System.out.println("Enter c:");
//         int c = ip.nextInt();

//         int[] cat = new int[c];

//         for (int i = 0; i < c; i++) {
//             cat[i] = ip.nextInt();
//         }

//         int[] weight = new int[n];

//         for (int i = 0; i < n; i++) {
//             weight[i] = ip.nextInt();
//         }

//         System.out.println(dataStream(cat, weight));
//     }

//     public static void increment(int[] cat, int idx, int[] temp) {
//         int n = cat.length;

//         if (n == idx)
//             return;

//         temp[cat[idx]]++;

//         increment(cat, idx + 1, temp);
//     }

//     public static int max(int[] temp) {
//         int n = temp.length;
//         int max = 0;

//         for (int i = 0; i < n; i++) {
//             if (temp[i] > 0) {
//                 max = Math.max(max, temp[i]);
//             }
//         }
//         return max;
//     }

//     public static int dataStream(int[] cat, int[] weight) {
//         int n = cat.length;
//         int m = weight.length;

//         int left = 0, right = 0;
//         int sum = 0;
//         int max = 0;

        
        
//         while(right<n){
//             int size = right - left + 1;
//             int half = size / 2;

                
//                 for (int ele : cat) {
//                     max = Math.max(ele, max);
//                 }
                
//                 int[] temp = new int[max + 1];
//                 increment(cat, 0, temp);
//                 int maxSize=max(temp);
                
//                 if(half>maxSize * 2){
//                     for(int i=left; i<=right; i++){
//                         sum+=weight[i];
//                     }
//                     left++;
//                 }
//                 right++;
//             }
//         return sum;

//     }
// }


// OR


import java.util.Scanner;
public class satelliteDataStream{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=ip.nextInt();

        System.out.println("Enter c: ");
        int c=ip.nextInt();

        int[] cat = new int[n];
        int[] weight = new int[n];

        for(int i=0; i<n; i++){
            cat[i]=ip.nextInt();
        }

        for(int i=0; i<n; i++){
            weight[i]=ip.nextInt();
        }

        System.out.println(dataStream(cat,weight,c));
    }


    // freq cal 
    public static void freq(int[] cat, int left, int right, int[] temp){
        for(int i=left; i<right; i++){
            temp[cat[i]]++;
        }
    }

    // max freq cal
    public static int maxFreq(int[] temp){
        int max=0;

        for(int i=0; i<temp.length; i++){
            max=Math.max(max,temp[i]);
        }
        return max;
    }

    // weight sum if valid
    public static int weightSum(int[] weight, int left, int right){
        int sum=0;

        for(int i=left; i<=right; i++){
            sum+=weight[i];
        }
        return sum;
    }

    // invalid check
    public static boolean isValid(int[] temp,int size){
        int max=maxFreq(temp);

        return max>size;
    }



    public static int dataStream(int[] cat, int[] weight, int c){
        int n=cat.length;
        int ans=0;
        
            
            for(int left=0; left<n; left++){

                for(int right=left; right<n; right++){
                    
                    int[] temp = new int[c];
                    freq(cat,left,right+1,temp);

                    int size=(right-left+1)/2;

                    if(isValid(temp,size)){

                        int sum=weightSum(weight,left,right);

                        ans=Math.max(ans,sum);
                        
                    }
                }
                
            }
        
        return ans;
    }
}