package ejercicios.UD3.R0;

import java.util.Scanner;

public class EJ19 {

    public static String capitaliazarCadena(String palabra) {

        String palabraCapitaliazada = "";

        for (int i = 0 ; i < palabra.length(); i++) {
            if (i == 0) {

                palabraCapitaliazada += Character.toUpperCase(palabra.charAt(i));
                
            }else{
                palabraCapitaliazada += Character.toLowerCase(palabra.charAt(i));

            }
        }
        return palabraCapitaliazada;

    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraUsuario;

        System.out.print("Introduce la palabra: ");

        palabraUsuario = scanner.nextLine();
        scanner.close();
        System.out.println("La palabra capitaliazada es: " + capitaliazarCadena(palabraUsuario));
    }
}


