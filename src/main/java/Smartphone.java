import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Smartphone {
    private String dueño;
    private String marca;
    private String modelo;
    private int numeroCelular;
    private ArrayList<String> appsInstaladas;
    private Map<String, Integer> contactos;

    public Smartphone(String dueño, String marca, String modelo, int numeroCelular) {
        this.dueño = dueño;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCelular = numeroCelular;
        this.appsInstaladas = appsDeFabrica();
        this.contactos = new HashMap<>();
    }

    private ArrayList<String> appsDeFabrica() {
        return new ArrayList<>(List.of("Fb", "Google", "Agenda", "Teléfono", "Web Browser"));
    }

    public void llamar(int numero) {
        System.out.println("Llamando a " + numero + " .......");
    }

    public void crearContacto(String nombre, int numeroCelular) {
        if (contactoExiste(nombre)) {
            System.out.println("El contacto " + nombre + " ya está registrado");
            return;
        }
        contactos.put(nombre, numeroCelular);
        System.out.println("Contacto agregado");
    }

    private boolean contactoExiste(String nombre) {
        return this.contactos.containsKey(nombre);
    }

    public void borrarContacto(String nombre) {
        if (!contactoExiste(nombre)) {
            System.out.println("El contacto " + nombre + " no está registrado");
            return;
        }
        contactos.remove(nombre, numeroCelular);
        System.out.println("Contacto borrado");
    }

    public void instalarApp(String nuevaApp) {
        if (appsInstaladas.contains(nuevaApp)) {
            System.out.println("La App " + nuevaApp + " ya está instalada");
            return;
        }
        appsInstaladas.add(nuevaApp);
        System.out.println("Se ha instalado " + nuevaApp);
    }

    public void desinstalarApp(String app) {
        if (!appsInstaladas.contains(app)) {
            System.out.println("La App " + app + " no está instalada");
            return;
        }
        appsInstaladas.remove(app);
        System.out.println("Se ha desinstalado " + app);
    }

    public void llamarContacto(String nombreContaco) {
        if (!contactoExiste(nombreContaco)) {
            System.out.println("No existe el contacto " + nombreContaco);
            return;
        }
        System.out.println("Llamando a " + nombreContaco + " .......");
    }

    public void cambiarDueño(String nuevoDueño) {
        this.dueño = nuevoDueño;
    }

    public void cambiarNumero(int nuevoNumero) {
        this.numeroCelular = nuevoNumero;
    }

    public void verDatosSmartphone() {
        System.out.println("Datos Smartphone");
        System.out.println(dueño);
        System.out.println(numeroCelular);
        System.out.println(marca);
        System.out.println(modelo);
    }

    public void verAppsInstaladas() {
        System.out.println(appsInstaladas);
    }

    public void verContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos");
            return;
        }
        System.out.println(contactos);
    }
}
