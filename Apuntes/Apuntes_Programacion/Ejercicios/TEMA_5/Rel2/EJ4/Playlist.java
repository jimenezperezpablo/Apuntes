package Apuntes.Apuntes_Programacion.Ejercicios.TEMA_5.Rel2.EJ4;

import java.util.ArrayList;

public class Playlist {
    // ### Ejercicio 4: Playlist y Canciones
    // En el `main`, implementa un **menú** para agregar y mostrar canciones. Usa la
    // clase `Faker` para generar 100 canciones.

    ArrayList<Cancion> canciones;

    Playlist() {
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        if (!canciones.contains(cancion)) {
            canciones.add(cancion);
        }
    }

    public void mostrarCanciones() {
        String mensaje = "";
        for (int i = 0; i < canciones.size(); i++) {
            mensaje += ((i + 1) + " | " + canciones.get(i).getTitulo() + " | " + canciones.get(i).getDuracion());
        }
    }

    public int mostrarDuracion() {
        int totalDuracion = 0;
        for (Cancion cancion : canciones) {

            totalDuracion += cancion.getDuracion();

        }
        return totalDuracion;
    }

}
