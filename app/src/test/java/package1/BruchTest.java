package package1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BruchTest {

    @Test
    @DisplayName("Should calculate the division of two positive numbers as a decimal number")
    public void testDivisionOfTwoPositiveNumbers(){
        Bruch testBruch = new Bruch(84,24);
        double  expected = 3.5;
        double actual = testBruch.ausrechnen();
        assertEquals(expected, actual);
    }
}
