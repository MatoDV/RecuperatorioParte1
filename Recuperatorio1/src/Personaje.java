public class Personaje {
    private EstrategiaCombate estrategiaCombate;
    private int salud;
    private int fuerza;


    private int magia;
    private int daño;

    public Personaje(int salud, int fuerza, int magia) {
        this.salud = salud;
        this.fuerza = fuerza;
        this.magia = magia;
    }

    public void setEstrategiaCombate(EstrategiaCombate estrategiaCombate) {
        this.estrategiaCombate = estrategiaCombate;
    }

    public void realizarCombate() {
        estrategiaCombate.ejecutar(this);
        System.out.println("Daño causado: " + daño);
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getMagia() {
        return magia;
    }

    public void recibirDaño(int daño) {
        this.salud -= daño;
        System.out.println("El personaje recibe " + daño + " de daño. Salud restante: " + salud);
    }

    public void recibirCuracion(int curacion) {
        this.salud += curacion;
        System.out.println("El personaje recibe " + curacion + " de curación. Salud actual: " + salud);
    }
}
