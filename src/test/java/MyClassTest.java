
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    @Test
    void testMessage() {
        assertEquals("Hello World", new MyClass().getMessage());
    }
}