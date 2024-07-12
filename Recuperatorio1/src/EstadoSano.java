public class EstadoSano  implements Estado{
    public void manejar(Contexto contexto) {
        System.out.println("El personaje está sano.");
        contexto.setSalud(100);
        contexto.setFuerza(50);
        contexto.setMagia(30);
    }
}
