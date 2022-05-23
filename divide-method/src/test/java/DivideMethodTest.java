import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {

    @Test
    @DisplayName("Divides a number by another and returns a double")
    void divide() {
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));

        DivideMethod.divide(7,2);
        assertTrue(testOutput.toString().contains("3.5"));

    }
}