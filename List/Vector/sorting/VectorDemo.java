import java.util.*;


class VectorDemo {
    public static void main(String[] args) {

        List<Integer> vector = new Vector <> ();
        
       vector.add(1);
       vector.add(5);
       vector.add(3);
       vector.add(2);

        System.out.println(vector);
    
        
       Collections.sort(vector);
       
       System.out.println(vector);
    
    }
}