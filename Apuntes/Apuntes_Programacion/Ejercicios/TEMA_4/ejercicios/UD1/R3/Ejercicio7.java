package ejercicios.UD1.R3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer datos del usuario
        System.out.print("Ingresa tu primer numero: ");
        double numeroUsuario1 = scanner.nextDouble();
        System.out.print("Ingresa tu segundo numero: ");
        double numeroUsuario2 = scanner.nextDouble();
        System.out.print("Introduce la operacion que quieras realizar (+,-,*,/) : ");
        String operacionUsuario = scanner.next();

        double resultado;

        if (operacionUsuario.equals("+")) {
            resultado = numeroUsuario1 + numeroUsuario2;
            System.out.println("La suma de " + numeroUsuario1 + " + " + numeroUsuario2 + " da como resultado: " + resultado);
        } else if (operacionUsuario.equals("-")) {
            resultado = numeroUsuario1 - numeroUsuario2;
            System.out.println("La resta de " + numeroUsuario1 + " - " + numeroUsuario2 + " da como resultado: " + resultado);
        } else if (operacionUsuario.equals("*")) {
            resultado = numeroUsuario1 * numeroUsuario2;
            System.out.println("La multiplicacion de " + numeroUsuario1 + " * " + numeroUsuario2 + " da como resultado: " + resultado);
        } else if (operacionUsuario.equals("/")) {
            resultado = numeroUsuario1 / numeroUsuario2;
            System.out.println("La division de " + numeroUsuario1 + " / " + numeroUsuario2+ " da como resultado: " + resultado);
        } else {
            System.out.println("No has introducido bien el operador");
        }
        scanner.close();
    }
}