package ejercicios.UD3.R0;

import java.util.Scanner;

public class EJ8 {

    public static int mayor(int primerNumero, int segundoNumero) {
        int numeroMayor;
        if (primerNumero < segundoNumero) {
            numeroMayor = segundoNumero;
        } else {
            numeroMayor = primerNumero;
        }
        return numeroMayor;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero1;
            int numero2 = 0;
            do {
                try {
                    System.out.print("Introduce tu numero 1: ");
                    numero1 = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    numero1 = -1;
                    System.out.println("ERROR al leer entero");
                }
            } while (numero1 < 0);
            do {
                try {
                    System.out.print("Introduce tu numero 2: ");
                    numero2 = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    numero2 = -1;
                    System.out.println("ERROR al leer entero");
                }
            } while (numero2 < 0);
            System.out.println("El numero " + mayor(numero1, numero2) + " es mayor");
        }
    }
}
