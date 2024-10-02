package Excepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numberCheck {
    public static void verifyNumber (Integer number) throws customException{
        if (number < 0){
            throw new customException("El numero no puede ser negativo");
        }
    }

    public static int scanNumber(Scanner teclado) {
        while (true) {
            try {
                return teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                teclado.next(); // Limpia el valor inválido del buffer
            }
        }
    }
}
