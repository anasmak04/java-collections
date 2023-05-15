import java.util.*;


class Main {
    public static void main(String[] args) {
       List <Number> list = new ArrayList <> ();
       
       list.add(2);
       list.add(4);
       list.add(8);
       list.add(16);
       list.add(32);
       list.add(64);
       list.add(128);
       
       System.out.println(list);
       
       list.remove(1); // this operation will remove element ath the index 1
       
       System.out.println(list);
       
       
       list.clear(); // this operation will remove all the elements from arraylist
       
        System.out.println(list);

    }
}