import java.math.*; // importacion de libreria (matematicas)
import java.util.Scanner;

public class prueba_calculadora {
    public static void main(String[] args) {

        // definicion de variables
        int accion;
        double numeroA;
        double numeroB;
        double total;

        //pedi la accion que quiere se que se realize
        Scanner leer = new Scanner(System.in); // leer lo que se pida
        System.out.println("Eliga (1,2..5) la ecuacion a realizar: 1)Suma, 2)Resta, 3)Division, 4)Multiplicacion, 5)Potencia");
        accion = leer.nextInt();

        //digitar
        if (accion < 1 || accion > 5) { // mientras que se haya elegido entre 1-5 todo bien.
            System.out.println("Acción inválida. Por favor elige un número entre 1 y 5.");
            return;
        }

        System.out.println("Digite tu 1er número:");
        numeroA = leer.nextDouble();

        System.out.println("Digite tu 2do número:");
        numeroB = leer.nextDouble();

        switch (accion) {
            case 1:
                total = numeroA + numeroB;
                break;
            case 2:
                total = numeroA - numeroB;
                break;
            case 3:
                total = numeroA / numeroB;
                break;
            case 4:
                total = numeroA * numeroB;
                break;
            case 5: //potencia (math.pow)
                total = Math.pow(numeroA, numeroB);
                break;
            default:
                total = 0;
        }

        System.out.println("El resultado es: " + total);
    }
}