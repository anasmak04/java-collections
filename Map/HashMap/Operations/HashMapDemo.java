import java.util.*;


class HashMapDemo {
    
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap <> ();
        map.put(1 , "jhon");
        map.put(2 , "bilal");
        
       // Checking if a key is present in the HashMap
        System.out.println(map.containsKey(1));
        // Checking if a value is present in the HashMap
        System.out.println(map.containsValue("bilal"));
        
        
        
       // Fetching all the keys and values from HashMap
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key is : " + entry.getKey()
            + " value is : " + entry.getValue());
        }
        
        //checking if the hashMap is empty
        System.out.println(map.isEmpty());
        
        
    }
}