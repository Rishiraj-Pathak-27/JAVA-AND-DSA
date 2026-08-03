// HashMap --> HashMap is a data structure which is a part of collection framework, also it is implemented through the Map Interface
// The Hash Map stores the data in the form of key and value, where key can have 1 duplicate but values can be multiple duplicates
// O(1) used to insert, remove and retrieve

// Syntax -> HashMap<Dtype1(key), Dtype2(value)> var_name = new HashMap<>();

// Eg. basic code to create a HashMap

// import java.util.HashMap;
// public class basics{
//     public static void main(String[] args){
//         HashMap<String, Integer> map = new HashMap<>();

//         map.put("Rishiraj",20); map.put("Ronaldo",40);
//         map.put("Utkarsh",17); map.put("Mohit",21);

//         System.out.println(map);
//         System.out.println(map.size());

//     }
// }

// HashMap Built-in Operations

// import java.util.HashMap;

// public class basics{
//     public static void main(String[] args){
        
//         // Creation
//         HashMap<String,Integer> map = new HashMap<>();
        
//         // 1) .put() -> used to add elements in map
//         map.put("Rishiraj",20); map.put("John",23);
//         map.put("Ferran",17); map.put("Mohit",45);
//         System.out.println(map);

//         // 2) .size() -> returns thr size of the hashmap
//         System.out.println(map.size());

//         // 3) .get() -> returns the value from the hash table using key
//         System.out.println(map.get("Rishiraj"));
//         System.out.println(map.get("John"));

//         // 4) .remove() -> removes the key:value pair from the hash table using key
//         System.out.println(map.containsKey("Mohit"));
//         map.remove("Mohit");
//         System.out.println(map+" "+map.size());

//         map.put("John",24);
//         System.out.println(map);

//         // 5) .containsKey() -> returns true if the key is present in the hashmap else returns false

//         System.out.println(map.containsKey("Mohit"));
//         System.out.println(map.containsKey("Rishiraj"));

//         // 6) .containsValue() -> returns true if the value is present in the hashmap else returns false

//         System.out.println(map.containsValue(23));
//         System.out.println(map.containsValue(20));

//     }
// }


// Traversing on a HashMap

import java.util.HashMap;

public class basics{
    public static void main(String[] args){
        HashMap<Integer, Character> map = new HashMap<>();

        map.put(90,'A'); map.put(70,'C'); map.put(30,'F'); 
        map.put(80,'B'); map.put(91,'A'); map.put(60,'D');

        System.out.println(map);

        // traversing based on key 

        for(int key : map.keySet()){
            // will print key and value both
            System.out.print(key+" "+map.get(key)+" ");
        }
    }
}
