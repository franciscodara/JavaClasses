/**
 * Operadores basicos:
 * Increment (++);
 * Decrement (--);
 * Addition (+);
 * Subtraction (-);
 * Multiplication (*);
 * Division (/);
 * Modulus (%);
 * Cast ( () );
 * Not (!).
 */

public class BasicOperators {
    public static void main (String[] args) {
        int number1 = 20;
        int number2 = 10;
        int number3 = 21;
        int resto = number3 / number2;
//        if ( resto = 0) {
//            System.out.println("O resto da divisão indica que o número é par");
//             {
//                System.out.println();
//            }
//        }
        System.out.println("A soma dos números 20 e 10 é: " + (number1 + number2));
        System.out.println("A subtração dos números 20 e 10 é: " + (number1 - number2));
        System.out.println("A multiplicação dos números 20 e 10 é: " + (number1 * number2));
        System.out.println("A divisão dos números 20 e 10 é: " + (number1 / number2));
        System.out.println("O resto da divisão dos números 21 e 10 é: " + (number3 % number2));
    }
}
