package Apuntes.Apuntes_Programacion.Ejercicios.TEMA_5.Rel2.EJ4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    // ### Ejercicio 4: Playlist y Canciones
    // En el `main`, implementa un **menú** para agregar y mostrar canciones. Usa la
    // clase `Faker` para generar 100 canciones.

    public static void mensajeNuevaLineaString(String stringMostrar) {
        System.out.println(stringMostrar);
    }

    public static void mensajeMismaLineaString(String stringMostrar) {
        System.out.print(stringMostrar);
    }

    public static int pedirRangoMenu(Scanner scanner, String textoMenuString, String textoOpcionString,
            String mensajeError, int minimoPosible, int maximoPosible) {

        int opcionMenu;
        do {
            mensajeNuevaLineaString(textoMenuString);
            mensajeMismaLineaString(textoOpcionString);
            try {
                opcionMenu = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                opcionMenu = minimoPosible - 1;
                mensajeNuevaLineaString(mensajeError);
            }
        } while (opcionMenu < minimoPosible || opcionMenu > maximoPosible);
        return opcionMenu;
    }

    public static void main(String[] args) {
        int rangoMenu;
        Scanner scanner = new Scanner(System.in);

        rangoMenu = pedirRangoMenu(scanner, "1.Agrega Canciones\n2.Enseña Canciones\n3.Mostrar duracion\n4.Salir",
                "Selecciona una opcion: ", "Error", 1, 4);

        if (rangoMenu == 1) {
            

        }

        if (rangoMenu == 2) {

        }

        if (rangoMenu == 3) {

        }

        if (rangoMenu == 4) {

        }

    }
}