// 2390. Removing Stars From a String

// public class removingStars{
//     public static void main(String[] args) {
//         String s = "leet**cod*e";
//         System.out.println(removeStars(s));
//     }

//     public static String removeStars(String s){
//         StringBuilder ans = new StringBuilder();
//         int n=s.length();

//         for(char ele:s.toCharArray()){
//             if(ele == '*'){
//                 int m=ans.length();
//                 if(m>0){
//                 ans.append('*');
//                 ans.delete(m-1,m+1);
//                 }
//             }else{
//                 ans.append(ele);    // leet*
//             }
//         }
//         return ans.toString();
//     }
// }

// OR Better Approach

public class removingStars{
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s){
        int j=0;
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == '*'){
                j--;
            }else{
                arr[j]=arr[i];
                j++;
            }
        }
        return new String(arr,0,j);
    }
}