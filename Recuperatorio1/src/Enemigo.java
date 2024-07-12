public class Enemigo implements ElementoJuego{
    private int salud;
    private int poderAtaque;

    public Enemigo(int salud, int poderAtaque) {
        this.salud = salud;
        this.poderAtaque = poderAtaque;
    }

    public void aceptar(VisitanteElementoJuego visitante) {
        visitante.visitar(this);
    }

    public void recibirDaño(int daño) {
        this.salud -= daño;
        System.out.println("El enemigo recibe " + daño + " de daño. Salud restante: " + salud);
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}
