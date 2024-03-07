package bubblesort;

/**
 *
 * @author Eskandar Atrakchi
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //create an array list
        //add items to the list
        // show the items in the list 
        //store the list in a temp 
        //call betterbubble on the arraylist 
        //check the time execution 
        //call the simpleBubble on the temp 
        //check the execution 
        
        MyArrayList <Integer> list1 = new MyArrayList<> ();
        MyArrayList <Integer> list2 = new MyArrayList <> ();
        
        for ( int i = 0; i < 1000; i ++ ) {
            
            list1.add(1);
            list1.add(5);
            list1.add(3);
            list1.add(20);
            list1.add(30);
            list1.add(340);
            list1.add(2340);
            list1.add(1230);
            list1.add(530);
            list1.add(3450);
            list1.add(3320);
            list1.add(450);
            list1.add(54340);
            list1.add(230);
            list1.add(130);
            list1.add(130);
            list1.add(7890);
            list1.add(65430);
            list1.add(3520);
            list1.add(24240);
            list1.add(4360);
            list1.add(3520);
            list1.add(141230);
            list1.add(2520);
            list1.add(23420);
            
        }
        
        System.out.println("after loop " + list1.size());
        list2.addAll(list1);
        
        System.out.println("before list1 " + list1);
        
        System.out.println("before list2 " + list2);
        
        final long STARTbetter = System.currentTimeMillis();
        list2.betterBubble();       
        final long ENDbetter = System.currentTimeMillis();
        
        //System.out.println("After better " + list2);  //testing line
        System.out.printf("Time taken for Better : " + ((ENDbetter - STARTbetter)) + " milli-seconds");
        
        //-------------------------------------------
        final long STARTsimple = System.currentTimeMillis();
        list1.simpleBubble();
        final long ENDsimple = System.currentTimeMillis();
        //-------------------------------------------
        System.out.println("");
        System.out.println("Time Taken for Simple : " + ((ENDsimple - STARTsimple)) + " miili-seconds");
        
        //System.out.println("before list2 " + list2);//testing line
        
        //rigorous
    }
    
}
