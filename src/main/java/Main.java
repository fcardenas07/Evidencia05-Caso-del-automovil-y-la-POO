public class Main {
    public static void main(String[] args) {
        Smartphone miSmartphone = new Smartphone(
                "Francisco",
                "Motorola",
                "g22",
                987654321);

        miSmartphone.verContactos();
        miSmartphone.crearContacto("Sol", 912345678);
        miSmartphone.verContactos();
        miSmartphone.borrarContacto("Juan");

        miSmartphone.verAppsInstaladas();
        miSmartphone.desinstalarApp("Fb");
        miSmartphone.verAppsInstaladas();
        miSmartphone.instalarApp("Gmail");
        miSmartphone.verAppsInstaladas();

        miSmartphone.verDatosSmartphone();
        miSmartphone.cambiarDueño("Sol");
        miSmartphone.cambiarNumero(967676767);
        miSmartphone.verDatosSmartphone();

        miSmartphone.llamar(987878787);
        miSmartphone.llamarContacto("Sol");
        miSmartphone.llamarContacto("Jack");
    }
}
