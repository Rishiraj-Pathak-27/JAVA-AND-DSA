
import java.util.HashSet;
public class distinctElements {
    public static void main(String[] args){
        int[] arr = {12, 1, 14, 3, 16};
        System.out.println(distincts(arr));
    }    

    public static int distincts(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int ele:arr){
            set.add(ele);
        }
        return set.size();
    }
}
