import java.util.ArrayList;
import java.util.List;

public class EventoJuego {
    private List<Observador> observadores = new ArrayList<>();

    public void añadirObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores(String evento) {
        for (Observador observador : observadores) {
            observador.actualizar(evento);
        }
    }
}
