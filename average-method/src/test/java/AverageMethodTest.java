import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @Test
    @DisplayName("Adds three doubles and returns the sum as a double")
    void sum() {
        assertEquals(10.5, AverageMethod.sum(1.4, 6.1, 3));
    }

    @Test
    @DisplayName("Returns the average of three numbers")
    void average() {
        assertEquals(3, AverageMethod.average(1, 2, 6));
    }
}