public class EstrategiaAtaqueCuerpoACuerpo implements EstrategiaCombate{
    public void ejecutar(Personaje personaje) {
        System.out.println("El personaje ataca cuerpo a cuerpo.");
        personaje.setDaño(15 + personaje.getFuerza());
    }
}
