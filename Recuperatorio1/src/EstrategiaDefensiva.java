public class EstrategiaDefensiva implements EstrategiaCombate{
    public void ejecutar(Personaje personaje) {
        System.out.println("El personaje adopta una táctica defensiva.");
        personaje.setDaño(5);
    }
}
