import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
class LinkedListComparatorTest {
    @Test void compareTest() {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList1.add(10);
        linkedList1.add(10);
        linkedList2.add(30);
        assertEquals(-1,new LinkedListComparator().compare(linkedList1,linkedList2));
        linkedList1.add(10);
        assertEquals(0,new LinkedListComparator().compare(linkedList1,linkedList2));
        linkedList1.add(10);
        assertEquals(1,new LinkedListComparator().compare(linkedList1,linkedList2));
    }
}