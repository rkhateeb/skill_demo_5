import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void multiplication(){
        assertEquals(4, skillDemo.product(3,2));
    }
}
