// WAP to Sort Characters Alphabetically

/* import java.util.Scanner;
public class sortAlphabetically{

    public static String sort(String s){

        char[] arr = s.toCharArray();
        
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = ip.nextLine();

        System.out.println(sort(str));
    }
}  */

// OR

import java.util.Arrays;
public class sortAlphabetically{

    public static String sort(String s){
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args){
        String str = "python";
        System.out.println(sort(str));
    }
}