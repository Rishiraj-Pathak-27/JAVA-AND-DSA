// WAP to Convert Sentence to Title Case

public class titleCase{

    public static String convertTitleCase(String str){
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i].length()<=2){
                sb.append(arr[i].toLowerCase());
            }
            else{
                sb.append(arr[i].substring(0,1).toUpperCase()).append(arr[i].substring(1));
            }
            sb.append(" ");
            
        }
            return sb.toString().trim();
    }

    public static void main(String[] args){
        String str = "hello world by rishiraj pathak";

        System.out.println(convertTitleCase(str));
    }
}