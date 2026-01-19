package ejercicios.UD3.R0;

import java.util.Scanner;

public class EJ20 {

    public static int contarCadena(String palabra) {

        int numeroPalabras = 0;

        numeroPalabras = palabra.split(" ").length;

        return numeroPalabras;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraUsuario;

        System.out.print("Introduce la cadena: ");

        palabraUsuario = scanner.nextLine();
        scanner.close();
        System.out.println("La longitud de la cadena es: " + contarCadena(palabraUsuario));
    }
}

