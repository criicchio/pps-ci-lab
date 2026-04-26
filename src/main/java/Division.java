/**
 * Simple class to do a division between two numbers
 */
public class Division {
    private double dividend;
    private double divisor;

    /**
     *
     * @param dividend the dividend of the division
     * @param divisor the divisor of the division
     */
    public Division(double dividend, double divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    /**
     *
     * @return the quotient of the division
     */
    public double doDivision() {
        if (divisor != 0) {
            return dividend / divisor;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}