package bubblesort;

import java.util.ArrayList;
/**
 *
 * @author Eskandar Atrakchi
 * @param <ElemType>
 */
public class MyArrayList < ElemType > extends ArrayList < ElemType > {
    
    public void betterBubble () {
        
        Comparable elemAtJ;
        Comparable elemAtJPlus;
        
        for (int i = 0; i < size (); i ++) {
        
            for (int j = 0; j < size () - 1 - i; j ++) {
                
                elemAtJ = (Comparable)get(j);
                elemAtJPlus = (Comparable)get(j + 1);
                
                if (elemAtJ.compareTo(elemAtJPlus) > 0) {
                    
                    swap (j , j + 1); //call the method
                    
                }
            }
        }
    }
    
    //swap method
    private void swap (int position1 , int position2) {
        
        //temp holder for the elemenets 
        // remove and add ur element to the correct position
        
        ElemType obj1 = get(position1);
        ElemType obj2 = get(position2);
        
        set (position1 , obj2);
        set (position2 , obj1);

        
    }
}
