package ejercicios.UD3.R0;

import java.util.Scanner;

public class EJ17 {

    public static String revertirCadena(String palabra) {

        String palabraReversa = "";
        for (int i = palabra.length(); i > 0; i--) {
            palabraReversa += palabra.charAt(i - 1);
        }
        return palabraReversa;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraUsuario;

        System.out.print("Introduce la palabra: ");

        palabraUsuario = scanner.nextLine();
        scanner.close();
        System.out.println("La palabra al reves es: " + revertirCadena(palabraUsuario));
    }
}
