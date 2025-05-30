public class Persona {

    String nombre;
    Double peso, altura, imc;

    public Persona(String nombre, Float peso, Float altura) {
        this.nombre = nombre;
        this.peso = peso.doubleValue();
        this.altura = altura.doubleValue();
    }

    public Double getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public static String clasificarImc(float imc) {
        String mensaje;
        if (imc >= 30) {
            mensaje = "Obesidad";
        } else if (imc >= 25) {
            mensaje = "Sobrepeso";
        } else if (imc >= 18.5) {
            mensaje = "Normal";
        } else {
            mensaje = "Bajo peso";
        }
        return mensaje;
    }
}
