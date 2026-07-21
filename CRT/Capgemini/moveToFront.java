// You have write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.
// Input:
// Move#Hash#to#Front
// Output:
// ###MoveHashtoFront

public class moveToFront{
    public static void main(String[] args) {
        String str = "Move#Hash#to#Front";
        System.out.println(moveHash(str));
    }

    public static String moveHash(String s){

       StringBuilder hash = new StringBuilder();
       StringBuilder text = new StringBuilder();
       char[] arr = s.toCharArray();
        int n=arr.length;

        for(int i=0; i<n; i++){
            if(arr[i]=='#'){
                hash.append('#');
            }else{
                text.append(arr[i]);
            }
        }
        return hash.append(text).toString();
    }
}