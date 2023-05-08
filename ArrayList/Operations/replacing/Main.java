import java.util.*;


class Main {
    public static void main(String[] args) {

       List <String> list =  new ArrayList <> ();
       
       	list.add("apple");
		list.add("banana");
		
		list.replaceAll(item -> item.toUpperCase());
		// method and provide it with a lambda expression that converts each element into uppercase.
		
		System.out.println(list);
		
		
        list.set(1 , "orange"); 
        // method to update an element in th arraylist
		System.out.println(list);
		
		
		if(list.contains("orange")){
		    System.out.println("orange is here");
		}
		else{
		    System.out.println("orange was not here");
		}
		
		/// contains is a method to check if the element in  arraylist exist or not
		
		

    }
}