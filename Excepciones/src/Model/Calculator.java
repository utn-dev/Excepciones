package Model;

public class Calculator {

    public static void division (Integer numerator , Integer denominator) throws ArithmeticException{
        if (denominator.equals(0)) {
            throw new ArithmeticException();
        }
            int result = numerator / denominator;
            System.out.println("El resultado de la division es : " + result);

        }
}
