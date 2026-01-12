package ejercicios.UD1.R3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer datos del usuario
        System.out.print("Ingresa tu numero: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario >= 10 && numeroUsuario <= 20) {
            System.out.println("El numero esta entre 10 y 20");
        }else{
            System.out.println("No esta entre 10 y 20");
        }
        scanner.close();
    }
}



