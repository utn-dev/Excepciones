import Excepcions.customException;
import Excepcions.numberCheck;
import Model.Calculator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // Solicitar el primer número hasta que sea positivo
        while (true) {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = numberCheck.scanNumber(teclado);  // Llama al método que captura números
                numberCheck.verifyNumber(num1);  // Verifica que el número no sea negativo
                break;  // Sale del bucle si el número es válido
            } catch (customException e) {
                System.out.println(e.getMessage());  // Muestra el mensaje si el número es negativo
            }
        }

        // Solicitar el segundo número hasta que sea positivo
        while (true) {
            try {
                System.out.println("Ingrese el segundo número:");
                num2 = numberCheck.scanNumber(teclado);  // Llama al método que captura números
                numberCheck.verifyNumber(num2);  // Verifica que el número no sea negativo
                break;  // Sale del bucle while si el número es válido
            } catch (customException e) {
                System.out.println(e.getMessage());  // Muestra el mensaje si el número es negativo
            }
        }

        // Intentar realizar la división
        try {
            Calculator.division(num1, num2);  // Realiza la división si ambos números son válidos
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: División por cero no permitida.");
        }

    }

}


