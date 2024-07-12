public class EstadoBerserker implements Estado{
    public void manejar(Contexto contexto) {
        System.out.println("El personaje está en modo berserker.");
        contexto.setSalud(80);
        contexto.setFuerza(70);
        contexto.setMagia(10);
    }
}
