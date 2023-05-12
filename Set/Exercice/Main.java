import java.util.*;


class Main {
    public static void main(String[] args) {

        /// find duplicate integers
        Set<Integer> set  = new HashSet <> ();
      int[] data = {12, 34, 1, 56, 43, 34, 65};
	  int duplicate = 0;

		for(int i : data){
		    if(!set.add(i)){
		        duplicate = i;
		        break;
		    }
		}

		System.out.println(duplicate);
    
        
    }
}