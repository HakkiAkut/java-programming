/**
 * @author Hakkı Can Akut
 */
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // example
        ArrayList<String> a= new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("A");
        a.add("A");
        a.add("C");
        // must print B
        System.out.println(removeDuplicates(a).get(0));
        // must print C
        System.out.println(removeDuplicates(a).get(1));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){

        // new ArrayList for non-duplicate elements
        ArrayList<E> noDuplicate = new ArrayList<>();
        // new ArrayList for duplicated elements.
        ArrayList<E> duplicated = new ArrayList<>();
        // with help of foreach loop, i add every element in list to the non-duplicate list but
        // if non-duplicate list contains an element, method removes element from the non-duplicate list
        // and add this element to the duplicate list
        for (E element : list) {

            if (!noDuplicate.contains(element)) {
                noDuplicate.add(element);
            }
            else {
                noDuplicate.remove(element);
                duplicated.add(element);
            }
        }
        // with help of foreach loop, we check elements in non-duplicate list with duplicate list.
        // because if there is odd number duplicated element, the last one doesn't gonna removed from non-duplicate list
        // so we had to check it. If there is a duplicated elements we remove it from non-duplicate list.
        for (E element : noDuplicate) {
            if (duplicated.contains(element)) {
                noDuplicate.remove(element);
            }
        }
        // at the end we return non-duplicate list
        return noDuplicate;
    }
}
