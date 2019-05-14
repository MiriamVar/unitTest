import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkTriangle() {
        Methods testTriangle = new Methods();
        assertEquals(-1,testTriangle.checkTriangle(5,6,25),0.0000001);
    }

    @Test
    void formatText() {
    }
}