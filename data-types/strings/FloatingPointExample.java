/**
 * Lesson: double stores binary floating-point approximations, so many decimal
 * fractions are not represented exactly. Use BigDecimal(String) for exact
 * decimal arithmetic such as financial values.
 */
import java.math.BigDecimal;

public class FloatingPointExample {
    public static void main(String[] args) {
        double sum = 0.1 + 0.2;
        BigDecimal exactSum = new BigDecimal("0.1").add(new BigDecimal("0.2"));

        System.out.println("double result: " + sum);
        System.out.println("BigDecimal result: " + exactSum);
    }
}
