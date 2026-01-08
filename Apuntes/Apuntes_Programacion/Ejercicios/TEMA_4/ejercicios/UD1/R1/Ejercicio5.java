package ejercicios.UD1.R1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer datos del usuario
        System.out.print("Ingresa tu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Su peso en la luna es: " + peso * 0.165); 
        scanner.close();
    }
}
