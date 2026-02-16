package Apuntes.Apuntes_Programacion.Ejercicios.TEMA_5.Rel2;

import java.util.ArrayList;

public class Universidad {
    ArrayList<Estudiante> alumnado;

    Universidad() {
        this.alumnado = new ArrayList<>();
    }

    public void agregarAlumno(Estudiante estudiante) {
        alumnado.add(estudiante);
    }

    public String mostrarString(){

        String lista = "";
        for (Estudiante estudiante : alumnado) {
            lista += estudiante.getNombre() + " | " ;
        }

        return lista;

    }

    public Estudiante buscarEstudiante(String matricula){

        Estudiante estudianteMostrar = null;
        for (Estudiante estudiante : alumnado) {
            if (estudiante.getNumeroMatricula().equals(matricula)) {

                estudianteMostrar = estudiante;
                
            }

        }
        return estudianteMostrar;
    }


}
