import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> inputList = new ArrayList<>(Arrays.asList("hi", "hello", "greetings"));
        List<String> expectedList = new ArrayList<>(Arrays.asList("hello"));
        assertEquals( expectedList , ListExamples.filter(inputList , new Length5Checker()));
    }

    @Test
    public void testFilter2() {
        List<String> inputList = new ArrayList<>(Arrays.asList("hi", "hello", "hallo", "greetings"));
        List<String> expectedList = new ArrayList<>(Arrays.asList("hello", "hallo"));
        assertEquals( expectedList , ListExamples.filter(inputList , new Length5Checker()));
    }

}