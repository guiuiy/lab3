import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void appendTest() {
        LinkedList test = new LinkedList();
        test.append(1);
        test.append(2);
        test.append(3);
        assertEquals("1 2 3 " , test.toString());
    }
 
}
