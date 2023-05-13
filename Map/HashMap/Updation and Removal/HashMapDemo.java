import java.util.*;


class HashMapDemo {
    
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap <> ();
        map.put(1, "jhon");
        map.put(2 , "bilal");
        
        // method takes a key as a parameter and returns the value
        System.out.println(map.get(1));
        
        
        /// getorDefault method check if key exist in map and will
        /// default value of 100
        System.out.println(map.getOrDefault(3, " not exist"));
      
      // replace method replace a value
      map.replace(2 , "bilal" , "anas");
      
      // replaceAll method replace all values 
      map.replaceAll((k,v) -> v + "*");
      
      
      System.out.println(map);
      
      /// to remove an element in a map by key as a argument
      System.out.println(map.remove(2));
      
    }
}