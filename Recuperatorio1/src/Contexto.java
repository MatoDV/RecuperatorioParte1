public class Contexto {
    private Estado estado;
    private int salud;
    private int fuerza;
    private int magia;

    public void setEstado(Estado estado) {
        this.estado = estado;
        estado.manejar(this);
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

    public void mostrarEstadisticas() {
        System.out.println("Salud: " + salud + ", Fuerza: " + fuerza + ", Magia: " + magia);
    }
}
