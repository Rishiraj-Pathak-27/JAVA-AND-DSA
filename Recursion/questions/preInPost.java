public class preInPost{
    public static void main(String[] args) {
        pipOne(2);
    }

    public static void pipOne(int n){
        if(n==0) return;
        System.out.print("Pre "+n+" "); 
        pipOne(n-1);
        System.out.print("In "+n+" ");
        pipOne(n-1);
        System.out.print("Post "+n+" ");
    }
}

// For 1 -> 1 1 1
// For 2 -> 2 1 1 1 2 1 1 1 2
// For 3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
// For 4 -> 4 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 4 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 4