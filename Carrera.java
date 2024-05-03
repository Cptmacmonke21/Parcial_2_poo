public class Carrera {
    Long codigo;
    String nombre;
    double promedioNotas;
    double promedioEdadEstudiantes;

    //Constructores, getters, setters, etc

    public Carrera() {
    }

    public Carrera(Long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioEdadEstudiantes() {
        return promedioEdadEstudiantes;
    }

    public void setPromedioEdadEstudiantes(double promedioEdadEstudiantes) {
        this.promedioEdadEstudiantes = promedioEdadEstudiantes;
    }

    public String toString() {
        return "Carrera: " + nombre + ", Código: " + codigo;
    }
}
