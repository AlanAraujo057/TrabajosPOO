public class Computadora {
    private String marca;
    private String modelo;
    private boolean encender;

    public Computadora(String marca, String modelo) {
        this.modelo = modelo;
        this.marca = marca;
        this.encender = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public boolean Encendida() {
        return encender;
    }

    public void encender() {
        if (!encender) {
            encender= true;
            System.out.println("Encendiendo...");
        }
    }
    public void apagar() {
        if (encender) {
            encender = false;
            System.out.println("Apagando...");
        }
    }
}
