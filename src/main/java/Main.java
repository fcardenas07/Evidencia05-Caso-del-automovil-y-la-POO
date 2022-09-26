public class Main {
    public static void main(String[] args) {
        Automovil automovil = new Automovil("BMW", "negro", 0);

        automovil.pintarAuto("Blanco");
        automovil.cambiarVelocidad(50);
        System.out.println("automovil.obtenerVelocidad() = " + automovil.obtenerVelocidad());
        automovil.parar();
        System.out.println("automovil.obtenerVelocidad() = " + automovil.obtenerVelocidad());
    }
}
