// RECURSION -> The reursion is an algorithm that is used to recursively call the function within itself many times until a specific base condition is met
// The Recursion iteratively and recursively makes the call so that it can be used to execute the same task without loops until a specific condition becomes false.
// The Calls of the recursive code is stored inside the Call Stack which creates a Recursive Ladder/tree to store and execute the data iteratively.

// An example of how the functions create a recursive ladder and performs infinite loop

public class recursionBasics{
    public static void main(String[] args){
        rishiraj();
    }

    public static void rishiraj(){
        System.out.println("Yash");
        rugved();
    }

    public static void rugved(){
        System.out.println("radha");
        mehak();
    }

    public static void mehak(){
        System.out.println("Rishiraj");
        rishiraj();
    }
}
