public class ObservadorPersonaje implements Observador {
    private Personaje personaje;

    public ObservadorPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void actualizar(String evento) {
        System.out.println("El personaje reacciona al evento: " + evento);

        switch (evento) {
            case "Aparece un jefe":
                reaccionarApareceJefe();
                break;
            case "Llega una nueva misión":
                reaccionarNuevaMision();
                break;
            case "Cambio en el entorno":
                reaccionarCambioEntorno();
                break;
            default:
                System.out.println("El personaje no reacciona a este evento.");
                break;
        }
    }

    private void reaccionarApareceJefe() {
        System.out.println("El personaje se prepara para la batalla contra el jefe.");
        // Aumentar la fuerza y reducir la salud para representar el esfuerzo.
        personaje.setFuerza(personaje.getFuerza() + 20);
        personaje.setSalud(personaje.getSalud() - 10);
        System.out.println("Estadísticas después de prepararse: Salud: " + personaje.getSalud() + ", Fuerza: " + personaje.getFuerza());
    }

    private void reaccionarNuevaMision() {
        System.out.println("El personaje se siente motivado por la nueva misión.");
        // Aumentar la salud para representar la motivación.
        personaje.setSalud(personaje.getSalud() + 15);
        System.out.println("Estadísticas después de recibir una nueva misión: Salud: " + personaje.getSalud());
    }

    private void reaccionarCambioEntorno() {
        System.out.println("El personaje se adapta al nuevo entorno.");
        // Cambiar la estrategia de combate como adaptación al nuevo entorno.
        personaje.setEstrategiaCombate(new EstrategiaDefensiva());
        System.out.println("El personaje ahora usa una estrategia defensiva.");
    }
}
