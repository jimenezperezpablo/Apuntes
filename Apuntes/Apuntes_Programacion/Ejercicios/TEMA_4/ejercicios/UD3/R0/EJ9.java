package ejercicios.UD3.R0;

import java.util.Scanner;

public class EJ9 {

    public static int menor3(int a, int b, int c) {
        int minimo = a;
        if (minimo > b) {
            minimo = b;
        }
        if (minimo > c) {
            minimo = c;
        }
        return minimo;
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero1;
            int numero2 = 0;
            int numero3 = 0;

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

             do {
                try {
                    System.out.print("Introduce tu numero 3: ");
                    numero3 = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    numero3 = -1;
                    System.out.println("ERROR al leer entero");
                }
            } while (numero3 < 0);

            System.out.println("El numero " + menor3(numero1, numero2, numero3) + " es el menor");
        }

    }

}
