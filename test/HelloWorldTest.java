import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    
    @Test
    void testSayHello() {
        HelloWorld h = new HelloWorld();

        assertEquals("Hello World!", h.sayHello());
    }
}
