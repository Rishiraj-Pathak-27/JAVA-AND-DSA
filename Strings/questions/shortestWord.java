// WAP to Find Shortest Word in a Sentence

public class shortestWord {

    public static String shortestInString(String s) {
        String[] arr = s.split(" ");
        int n=arr.length;
        String shortest="";
        int min=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i].length() < min){
                min=arr[i].length();
                shortest=arr[i];
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        String str = "Data science and AI";

        System.out.println(shortestInString(str));
    }
}
