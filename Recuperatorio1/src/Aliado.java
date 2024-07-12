public class Aliado implements ElementoJuego{
    private String nombre;

    public Aliado(String nombre) {
        this.nombre = nombre;
    }

    public void aceptar(VisitanteElementoJuego visitante) {
        visitante.visitar(this);
    }

    public void curar(Personaje personaje) {
        personaje.recibirCuracion(20);
        System.out.println("El aliado " + nombre + " cura al personaje. Salud aumentada en 20.");
    }

    public String getNombre() {
        return nombre;
    }
}
