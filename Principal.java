import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // Crear instancias de ListaEstudiante y ListaCarrera
        ListaEstudiante listaEstudiante = new ListaEstudiante();
        ListaCarrera listaCarrera = new ListaCarrera();

        // Calcular y mostrar los reportes por carrera
        List<ListaEstudiante.Imprimir> imprimirNotas = ListaEstudiante.Imprimir.calcularNotas(listaEstudiante, listaCarrera);
        ListaEstudiante.Imprimir.imprimirReportes(imprimirNotas);
    }
}
