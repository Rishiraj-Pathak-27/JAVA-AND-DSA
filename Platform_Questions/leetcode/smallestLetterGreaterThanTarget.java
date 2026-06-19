// 744. Find Smallest Letter Greater Than Target

public class smallestLetterGreaterThanTarget{

    public static char isLexographically(char[] a, char b){

    for(char ele:a){
        if(ele>b){
            return ele;
        }
    }
    return a[0];

    }

    public static void main(String[] args) {
        char[] a = {'c','f','j'};
        char target = 'a';

        System.out.println(isLexographically(a, target));
    }
}