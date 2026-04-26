/**
 * Simple class to do a division between two numbers
 */
public class Division {
    private double firstNumber;
    private double secondNumber;

    /**
     *
     * @param firstNumber the dividend of the division
     * @param secondNumber the divisor of the division
     */
    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    /**
     *
     * @return the quotient of the division
     */
    public double doDivision() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}