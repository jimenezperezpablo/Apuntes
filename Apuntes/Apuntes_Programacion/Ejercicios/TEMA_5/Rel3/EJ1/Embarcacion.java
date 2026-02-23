package Apuntes.Apuntes_Programacion.Ejercicios.TEMA_5.Rel3.EJ1;

public class Embarcacion {

    private String matricula;
    private String nombre;
    private double eslora;
    private String tipo;
    private String propietario;
    private int anioFabricacion;
    public double valorEstimado;

    public Embarcacion(String matricula, String nombre, double eslora, String tipo, String propietario,
            int anioFabricacion) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.eslora = eslora;
        this.tipo = tipo;
        this.propietario = propietario;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null) {
            this.matricula = matricula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        if (eslora > 0) {

            this.eslora = eslora;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Velero") && tipo.equals("Lancha") && tipo.equals("Yate") && tipo.equals("Catamaran")
                && tipo.equals("Moto de agua")) {
            this.tipo = tipo;
        }
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion >= 1950 && anioFabricacion <= 2026) {

            this.anioFabricacion = anioFabricacion;
        }
    }

}
