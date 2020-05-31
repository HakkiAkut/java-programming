/**
 * @version 1.0.0 May 31, 2020
 * @author Hakkı Can Akut
 */

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListComparator implements Comparator<LinkedList<Integer>> {
    // Compares sum of 2 LinkedList's elements
    @Override
    public int compare(LinkedList<Integer> a, LinkedList<Integer> b) {
        int sum1 = 0;
        int sum2 = 0;
        // sum of Linked List a's elements
        for(int i1: a){
            sum1 += i1;
        }
        // sum of Linked List b's elements
        for(int i2: b) {
            sum2 += i2;
        }
        if (sum1<sum2){ return -1; }
        else if(sum1==sum2){ return 0; }
        else { return 1; }
    }
}
