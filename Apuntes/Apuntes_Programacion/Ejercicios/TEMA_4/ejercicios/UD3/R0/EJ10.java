package ejercicios.UD3.R0;

import java.util.Scanner;

public class EJ10 {

    public static double areaTriangulo(double base, double altura) {
        return base * altura / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        do {
            try {
                System.out.print("Introduce la base: ");
                base = scanner.nextDouble();
                scanner.nextLine();
            } catch (Exception e) {
                scanner.nextLine();
                base = -1;
                System.out.println("ERROR al leer numero");
            }
        } while (base < 0);
        do {
            try {
                System.out.print("Introduce la altura: ");
                altura = scanner.nextDouble();
                scanner.nextLine();
            } catch (Exception e) {
                scanner.nextLine();
                altura = -1;
                System.out.println("ERROR al leer numero");
            }
        } while (altura < 0);
        scanner.close();
        System.out.println("El area es: " + areaTriangulo(base, altura));
    }
}