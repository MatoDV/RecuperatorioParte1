public class Main {
    public static void main(String[] args) {
        // 1. Cambio de Estado
        Contexto contexto = new Contexto();
        contexto.setEstado(new EstadoSano());
        contexto.mostrarEstadisticas();
        contexto.setEstado(new EstadoHerido());
        contexto.mostrarEstadisticas();
        contexto.setEstado(new EstadoEnvenenado());
        contexto.mostrarEstadisticas();
        contexto.setEstado(new EstadoBerserker());
        contexto.mostrarEstadisticas();

        // 2. Estrategias de Combate
        Personaje personaje = new Personaje(100, 50, 30);
        personaje.setEstrategiaCombate(new EstrategiaAtaqueCuerpoACuerpo());
        personaje.realizarCombate();
        personaje.setEstrategiaCombate(new EstrategiaAtaqueMagico());
        personaje.realizarCombate();
        personaje.setEstrategiaCombate(new EstrategiaDefensiva());
        personaje.realizarCombate();

        // 3. Interacción con Enemigos y Aliados
        Enemigo enemigo = new Enemigo(50, 10);
        Aliado aliado = new Aliado("Juan");
        VisitanteElementoJuego visitanteInteraccion = new VisitanteInteraccion(personaje);
        enemigo.aceptar(visitanteInteraccion);
        aliado.aceptar(visitanteInteraccion);

        // 4. Reacción a Eventos del Juego
        EventoJuego eventoJuego = new EventoJuego();
        Observador observadorPersonaje = new ObservadorPersonaje(personaje);
        eventoJuego.añadirObservador(observadorPersonaje);
        eventoJuego.notificarObservadores("Aparece un jefe");
        eventoJuego.notificarObservadores("Llega una nueva misión");
        eventoJuego.notificarObservadores("Cambio en el entorno");
    }
}