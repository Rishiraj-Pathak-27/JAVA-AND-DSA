// In the intergalactic archive of Planet Xyphor, two ancient data crystals a[] and b[] store encrypted energy signatures. Due to cosmic duplication anomalies, many signatures may repeat within and across the crystals.
// The Galactic Council must compute the total number of distinct energy signatures present when both crystals are merged into a unified repository.
// If a signature appears multiple times, it must be counted only once.
// Your task is to determine the number of unique energy signatures after combining both arrays.

// import java.util.Arrays;
// public class uniqueElements {

//     public static void main(String[] args){
//         int[] a = {85,25,1,32,54,6};
//         int[] b = {85,2};
//         System.out.println(unique(a,b));
//     }

//     public static int unique(int[] a, int[] b){
//         int n=a.length;
//         int m=b.length;

//         int[] unique = new int[Math.max(n,m)];

//         int i=0, j=0, k=0;

//         while(i<n && j<m){
//             if(a[i]==b[j]){
//                 unique[k++]=a[i];
//             }
//             i++;
//             j++;
//         }

//         while(i<n){
//             unique[k++]=a[i];
//             i++;
//         }

//         while(j<m){
//             unique[k++]=b[j];
//             j++;
//         }

//         return unique.length;    
//     }
// }


// OR

import java.util.HashSet;
public class uniqueElements {

    public static void main(String[] args){
        int[] a = {85,25,1,32,54,6};
        int[] b = {85,2};
        System.out.println(unique(a,b));
    }

    public static int unique(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();

        for(int ele:a){
            set.add(ele);
        }

        for(int ele:b){
            set.add(ele);
        }

        return set.size();
    }
}
