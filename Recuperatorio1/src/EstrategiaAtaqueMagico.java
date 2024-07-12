public class EstrategiaAtaqueMagico implements EstrategiaCombate{
    public void ejecutar(Personaje personaje) {
        System.out.println("El personaje usa magia.");
        personaje.setDaño(10 + personaje.getMagia());
    }
}
