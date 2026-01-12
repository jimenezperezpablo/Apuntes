package ejercicios.UD1.R3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Leer datos del usuario
        System.out.print("Ingresa tu numero: ");
        int numeroUsuario1 = scanner.nextInt();

        int resultado;

        if (numeroUsuario1 >= 10 && numeroUsuario1 <=99) {
            int primerNumero = numeroUsuario1 / 10;
            int SegundoNumero = numeroUsuario1 % 10;
            resultado = primerNumero + SegundoNumero;
            System.out.println("El resultado de la suma de los 2 numero es: " + resultado);   
        }else{
            System.out.println("No es correcto el numero introducido");
        }
        scanner.close();
    }
}
