import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DivisionTest {
    @Test
    void testDivision() {
        double dividend = 10.0;
        double divisor = 2.0;
        Division division = new Division(dividend, divisor);
        assertEquals(dividend/divisor, division.doDivision());
    }
    
    @Test
    void testDivisionByZero() {
        double dividend = 10.0;
        double divisor = 0.0;
        Division division = new Division(dividend, divisor);
        assertThrows(ArithmeticException.class, division::doDivision);
    }
}
