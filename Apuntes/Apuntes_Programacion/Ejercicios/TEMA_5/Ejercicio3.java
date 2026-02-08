package Apuntes.Apuntes_Programacion.Ejercicios.TEMA_5;

public class Ejercicio3 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Pablo", "Tecnologia", 5.8);
        System.out.println(alumno);
    }

}

class Alumno {

    String nombre;
    String materia;
    Double calificacion;

    Alumno(String nombre, String materia, Double calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    boolean aprobo() {
        boolean aprobado;
        if (this.calificacion < 6) {

            aprobado = false;

        } else {
            aprobado = true;
        }
        return aprobado;
    }

    @Override
    public String toString() {
        return "El nombres es: " + this.nombre + " | La materia es: " + this.materia + " | La calificacion es: "
                + this.calificacion + " | " + this.aprobo();
    }
}
