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
        
        MyArrayList <Integer> list1 = new MyArrayList<Integer> ();
        
        list1.add(2);
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(0);
        
        
        System.out.println("before " + list1);

        list1.betterBubble();
        
        System.out.println("After " + list1);
        
    }
    
}
