import java.util.*;


class HashMapDemo {
    
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap <> ();
      
      // put methode put a key and value inside map  
      System.out.println("integer is a key and string is a value : "+ map.put(1, "jhon"));
        
       
       // putifabsent check if key is already exist in map
       System.out.println(map.putIfAbsent(1,"anas"));
       
       System.out.println(map);
    }
}