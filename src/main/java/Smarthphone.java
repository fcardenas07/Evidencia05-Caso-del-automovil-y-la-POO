import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Smarthphone {
    private String dueño;
    private String marca;
    private String modelo;
    private int numeroCelular;
    private List<String> AppsInstaladas;
    private Map<String, Integer> contactos;


    public Smarthphone(String dueño, String marca, String modelo, int numeroCelular) {
        this.dueño = dueño;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroCelular = numeroCelular;
        this.AppsInstaladas = List.of("Fb", "Google", "Agenda", "Teléfono", "Web Browser");
        this.contactos = new HashMap<>();
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
        if (contactoNoExiste(nombre)) {
            System.out.println("El contacto " + nombre + " no está registrado");
            return;
        }
        contactos.remove(nombre, numeroCelular);
        System.out.println("Contacto borrado");
    }

    public void instalarApp(String nuevaApp) {
        if (AppsInstaladas.contains(nuevaApp)) {
            System.out.println("La App " + nuevaApp + " ya está instalada");
            return;
        }
        AppsInstaladas.add(nuevaApp);
        System.out.println("Se ha instalado " + nuevaApp);
    }

    public void desinstalarApp(String app) {
        if (!AppsInstaladas.contains(app)) {
            System.out.println("La App " + app + " no está instalada");
            return;
        }
        AppsInstaladas.remove(app);
        System.out.println("Se ha desinstalado " + app);
    }


    public void llamarContacto(String nombreContaco) {
        if (contactoNoExiste(nombreContaco)) {
            System.out.println("No existe el contacto " + nombreContaco);
            return;
        }
        System.out.println("Llamando a " + nombreContaco + " .......");
    }

    private boolean contactoNoExiste(String nombreContaco) {
        return !this.contactos.containsKey(nombreContaco);
    }

    public void cambiarDueño(String nuevoDueño) {
        this.dueño = nuevoDueño;
    }

    public void verDueño() {
        System.out.println(dueño);
    }

    public void verMarca() {
        System.out.println(marca);
    }

    public void verModelo() {
        System.out.println(modelo);
    }

    public void verNumeroCelular() {
        System.out.println(numeroCelular);
    }

    public void verAppsInstaladas() {
        System.out.println(AppsInstaladas);
    }

    public void verContactos() {
        System.out.println(contactos.toString());
    }
}
