import java.math.*; // importacion de libreria (matematicas)
import java.util.Scanner;

public class calculadora_mg {
    public static void main(String[] args) {

        // definicion de variables
        int accion;
        double numeroA;
        double numeroB;
        double total;

        //pedi la accion que quiere se que se realize
        Scanner leer = new Scanner(System.in); // leer lo que se pida
        System.out.println("Eliga (1,2..5) la ecuacion a realiar: 1)Suma,2)Resta,3)Division,4)Multiplicacion,5)Potencia");
        accion = leer.nextInt();

        //digitar
        System.out.println("Digite tu 1er numero:");
        numeroA = leer.nextDouble();

        System.out.println("Digite tu 2do numero:");
        numeroB = leer.nextDouble();

        if(accion >=1 && accion <=5){ // mientras que se haya elegido entre 1-5 todo bien.

            if(accion == 1){
                total = numeroA+numeroB;
                System.out.println("El resultado es: "+total);
            }

            if(accion == 2){
                total = numeroA - numeroB;
                System.out.println("El resultado es: "+total);
            }

            if(accion == 3){
                    total = numeroA/numeroB;
                    System.out.println("El resultado es: "+total);
            }

            if(accion == 4){
                total = numeroA * numeroB;
                System.out.println("El resultado es: "+total);
            }

            if(accion == 5){ //potencia (math.pow)
                total = Math.pow(numeroA, numeroB);
                System.out.println("El resultado es: "+total);
            }

        }

    }
}
