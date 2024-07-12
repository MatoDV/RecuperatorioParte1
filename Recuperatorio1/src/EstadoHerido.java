public class EstadoHerido implements Estado{
    public void manejar(Contexto contexto){
        System.out.println("El personaje está herido.");
        contexto.setSalud(50);
        contexto.setFuerza(30);
        contexto.setMagia(20);
    }
}
