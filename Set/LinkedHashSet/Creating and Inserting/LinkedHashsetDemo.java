import java.util.*;


class LinkedHashSetDemo {
    public static void main(String[] args) {
        
      Set<Integer> set = new LinkedHashSet <> ();
      
    System.out.println("Inserting 1 in the HashSet:  " + set.add(1));
    System.out.println("Inserting 1 in the HashSet:  " + set.add(2));
    System.out.println("Inserting 1 in the HashSet:  " + set.add(3));
    
    
    System.out.println(set);
    
        // check if set contain a value;
        System.out.println(set.contains(23));
    
        
    }
}