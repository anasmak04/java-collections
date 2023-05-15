import java.util.*;


class VectorDemo {
    public static void main(String[] args) {

        List<Integer> vector = new Vector <> ();
        
    // to add new element to the vector list
       vector.add(1);
       vector.add(2);
       vector.add(3);
       vector.add(4);

    
      
      List <String> list = new ArrayList <> ();
      list.add("jhon");
      list.add("smith");
      
      List<String> vector2 = new Vector <> ();
      /// to add a collection to the new vector list
      vector2.addAll(list);
      System.out.println(vector2);
      
                
    
    }
}