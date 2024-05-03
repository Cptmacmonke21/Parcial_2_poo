import java.util.ArrayList;
import java.util.List;

public class ListaEstudiante {
    private List<Estudiante> estudiantes;

    public ListaEstudiante() {
        estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", 20, 101L, 4.5));
        estudiantes.add(new Estudiante("María", 22, 102L, 4.1));
        estudiantes.add(new Estudiante("Carlos", 21, 103L, 3.8));
        estudiantes.add(new Estudiante("Rosa", 23, 101L, 4.5));
        estudiantes.add(new Estudiante("Luisa", 24, 102L, 4.1));
        estudiantes.add(new Estudiante("Camila", 21,103L, 3.8));
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public static class Imprimir {
        private Carrera carrera;
        private double promedioNotas;
        private double promedioEdadEstudiantes;

        public Imprimir(Carrera carrera, double promedioNotas, double promedioEdadEstudiantes) {
            this.carrera = carrera;
            this.promedioNotas = promedioNotas;
            this.promedioEdadEstudiantes = promedioEdadEstudiantes;
        }

        public Carrera getCarrera() {
            return carrera;
        }

        public double getPromedioNotas() {
            return promedioNotas;
        }

        public double getPromedioEdadEstudiantes() {
            return promedioEdadEstudiantes;
        }

        public static List<Imprimir> calcularNotas(ListaEstudiante listaEstudiante, ListaCarrera listaCarrera) {
            List<Imprimir> imprimirNotas = new ArrayList<>();

            for (Carrera carrera : listaCarrera.getCarreras()) {
                double sumaNotas = 0;
                double sumaEdades = 0;
                int cantidadEstudiantes = 0;

                for (Estudiante estudiante : listaEstudiante.getEstudiantes()) {
                    if (estudiante.getCarrera() == carrera.getCodigo()) {
                        sumaNotas += estudiante.getPromedio();
                        sumaEdades += estudiante.getEdad();
                        cantidadEstudiantes++;
                    }
                }

                double promedioNotas = sumaNotas / Math.max(cantidadEstudiantes, 1);
                double promedioEdades = sumaEdades / Math.max(cantidadEstudiantes, 1);

                imprimirNotas.add(new Imprimir(carrera, promedioNotas, promedioEdades));
            }

            return imprimirNotas;
        }

        public static void imprimirReportes(List<Imprimir> imprimirNotas) {
            System.out.println("Reportes por carrera:");
            for (Imprimir reporte : imprimirNotas) {
                System.out.println("Carrera: " + reporte.getCarrera().getNombre());
                System.out.println("Promedio de notas: " + reporte.getPromedioNotas());
                System.out.println("Promedio de edades: " + reporte.getPromedioEdadEstudiantes());
                System.out.println();
            }
        }
    }
}
