// Find the first repeating element


import java.util.HashSet;
public class firstRepeatingElement {
    public static void main(String[] args){
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeating(arr));
    }

    public static int firstRepeating(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr){
            if(set.contains(ele)) return ele;
            else set.add(ele);
        }
        return -1;
    }
}
