import java.util.*;


class HashSetDemo {
    public static void main(String[] args) {
        
      Set<Integer> set = new HashSet <> ();
      
   set.add(1);
   set.add(2);
   set.add(62);
   set.add(3);
   
   
        /// to iterate inside set using forEach loop
        for(int i : set){
            System.out.println(i);
        }
    
    
        /// to iterate inside set using Iterator
        Iterator itr = set.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
    
    /// to iterate inside set using forEach method
    set.forEach(System.out::println);
    
    
    
    /// sorting a hashSet 
    /// we need first to convert set to list
    List <Integer> list = new ArrayList <> (set);
    
    Collections.sort(list);
    
    list.forEach(System.out::println);
    
    
        
    }
}