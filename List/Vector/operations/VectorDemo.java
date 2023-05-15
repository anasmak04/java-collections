import java.util.*;


class VectorDemo {
    public static void main(String[] args) {

        List<Integer> vector = new Vector <> ();
        
       vector.add(1);
       vector.add(5);
       vector.add(3);
       vector.add(2);
        
       // to remove an element
       vector.remove(1);
      // to check if the vector is empty or not
      System.out.println(vector.isEmpty());
        // Returns true if A vector contains the specified element, false otherwise.
        System.out.println(vector.contains(2));
        
    
    }
}