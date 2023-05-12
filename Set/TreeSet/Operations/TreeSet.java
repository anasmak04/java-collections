import java.util.*;


class TreeSetDemo {
    public static void main(String[] args) {
        
      Set<Integer> set = new TreeSet <> ();
      
   set.add(1);
   set.add(2);
   set.add(3);
   
   set.remove(2);
   
   System.out.println("set after removing value of 2 : " + set);
    
   System.out.println();
    
  set.clear();
  System.out.println("set after removing all values in set : " + set);

    
        
    }
}