import java.util.*;

class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList <> ();
        
        list.add(1);
        list.add(5);
        
        
          // Iterate with boocle for
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
        
        
            // Iterate using forEach
            for (Integer i : list) {   
			System.out.println(i);
		}
        
        
        // Iteration using Iterate interface
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
    }
}