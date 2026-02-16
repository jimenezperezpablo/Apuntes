package Apuntes.Apuntes_Programacion.Ejercicios.TEMA_5.Rel2;

public class Estudiante {

    private String nombre;
    private int edad;
    private String numeroMatricula;

    Estudiante(String nombre, int edad, String numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        if (edad>0) {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "La persona se llama: " + nombre + ". Tiene: " + edad + " años y su numero de matricula es: "
                + numeroMatricula;

    }

}
