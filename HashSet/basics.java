// Hash Set is an Unordered set used to store the distinct elements.

// Syntax -> HashSet<DType> var_name = new HashSet<>();

// public class basics{
//     public static void main(String[] args) {
//         // HashSet<Integer> set = new HashSet<>();
//         // set.add(9); set.add(24); set.add(43); set.add(11); set.add(9);
//         // System.out.println(set);
//         // System.out.println(set.size());
//         // System.out.println(set.contains(11)+" "+set.contains(100));
//         // set.remove(11);
//         // System.out.println(set.size());

//         // int[] arr = {5,4,3,2,1};
//         // TreeSet<Integer> set = new TreeSet<>();

//         // for(int ele:arr){
//         //     set.add(ele);
//         // }
//         // System.out.println(set);
//     }
// }

// import java.util.HashSet;
// public class basics{
//     public static void main(String[] args){
//         HashSet<Integer> ans = new HashSet<>();

//         // 1) .add()

//         ans.add(10); ans.add(20); ans.add(30);
//         ans.add(40); ans.add(50); ans.add(60);
//         ans.add(70); ans.add(80); ans.add(90);

//         // 2) .size();

//         System.out.println(ans);
//         System.out.println(ans.size());

//         // .contains();

//         System.out.println(ans.contains(20));
//         System.out.println(ans.contains(50));

//         // .remove();

//         System.out.println(ans.remove(90));
//         System.out.println(ans);

//         // .clear();
//         ans.clear();
//         System.out.println(ans);
//         System.out.println(ans.size());
//     }
// }


// Iterator Example
// Iterator is used to iterate over the set like other loops and has various built in methods

import java.util.HashSet;
import java.util.Iterator;

public class basics{
    public static void main(String[] agrs){
        HashSet<Integer> ans = new HashSet<>();
        ans.add(10); ans.add(20); ans.add(30);
        ans.add(40); ans.add(50); ans.add(60);
        ans.add(70); ans.add(80); ans.add(90);

        Iterator<Integer> it = ans.iterator();

        while(it.hasNext()){
            int ele = it.next();
            System.out.print(ele+" ");

            if(ele==50){
                it.remove();
            }
        }
        System.out.println();
        System.out.println(ans);

    }
}