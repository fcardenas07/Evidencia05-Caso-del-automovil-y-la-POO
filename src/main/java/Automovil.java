public class Automovil {
    private String marca;
    private String color;
    private int velocidad;

    public Automovil(String marca, String color, int velocidad) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int obtenerVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void pintarAuto(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void parar() {
        this.velocidad = 0;
        System.out.println("Se ha detenido el vehiculo");
    }

    public void cambiarVelocidad(int velocidad) {
        this.velocidad += velocidad;
    }

}
