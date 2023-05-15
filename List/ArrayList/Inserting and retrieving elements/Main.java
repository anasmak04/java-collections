import java.util.*;


class Main {
    public static void main(String[] args) {
       List <Number> list = new ArrayList <> ();
       list.add(2);
       list.add(4);
       list.add(8); /// this will add 8 at the end of the List
       
       System.out.println(list);
        // the list will display like this [2 ,4 ,8]
       
       
       list.add(1, 30); /// this will add 3 at the index 1;
       
       System.out.println(list);
       // so the list will display like this [2, 30 ,4 ,8]
       
       
       List <Number> newList = new ArrayList <> ();
       
       newList.addAll(list); // this method will be added all elements from original list
       
       System.out.println(newList);
    }
}