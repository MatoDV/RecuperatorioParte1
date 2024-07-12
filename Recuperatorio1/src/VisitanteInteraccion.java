public class VisitanteInteraccion implements VisitanteElementoJuego{
    private Personaje personaje;

    public VisitanteInteraccion(Personaje personaje) {
        this.personaje = personaje;
    }

    public void visitar(Enemigo enemigo) {
        System.out.println("Interactuando con un enemigo.");
        if (enemigo.estaVivo()) {
            personaje.recibirDaño(enemigo.getPoderAtaque());
        } else {
            System.out.println("El enemigo está muerto.");
        }
    }

    public void visitar(Aliado aliado) {
        System.out.println("Interactuando con un aliado.");
        aliado.curar(personaje);
    }
}
