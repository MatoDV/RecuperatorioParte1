public class EstadoEnvenenado implements Estado{
    public void manejar(Contexto contexto) {
        System.out.println("El personaje está envenenado.");
        contexto.setSalud(30);
        contexto.setFuerza(20);
        contexto.setMagia(10);
    }
}
