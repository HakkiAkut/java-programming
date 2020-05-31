/**
 * @author Hakkı Can Akut
 */

public class MaxElement {
    public static void main(String[] args) {
        Integer[][] list = new Integer[2][2];
        list[0][0]= 3;
        list[0][1]= 5;
        list[1][0]= 6;
        list[1][1]= 2;
        // must print 6
        System.out.println(getMaxElement(list));
    }

    public static <E extends Comparable<E>> E getMaxElement(E[][] list) {
        // method create generic object max as first element of list.
        E max = list[0][0];
        // with 2 loops, method checks 2d array
        // with compareTo() method we compare elements, if an element in list greater than max is become our new max
        // at the end method return max
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                if(list[i][j].compareTo(max) >= 0){
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
