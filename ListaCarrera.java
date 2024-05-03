import java.util.ArrayList;
import java.util.List;

    public class ListaCarrera {
        List<Carrera> carreras;

        public List<Carrera> getCarreras() {
            return carreras;
        }

        public void setCarreras(List<Carrera> carreras) {
            this.carreras = carreras;
        }

        public ListaCarrera() {
            carreras = new ArrayList<>();
            carreras.add(new Carrera(101L, "Ingeniería de Sistemas"));
            carreras.add(new Carrera (102L, "Ingeniería Industrial"));
            carreras.add(new Carrera (103L, "Matemáticas"));
        }
    }

