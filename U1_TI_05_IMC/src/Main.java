import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        Float peso, altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu peso en KG");
        peso = Float.valueOf(sc.nextLine());
        System.out.println("Ingresa tu altura en Metros");
        altura = Float.valueOf(sc.nextLine());

        Persona persona = new Persona(nombre, peso, altura);

        persona.setImc(persona.calcularImc());

        System.out.printf(persona.getNombre() + ", tu IMC es de: %.2f\n", persona.getImc());
        System.out.printf("Clasificación: " + Persona.clasificarImc(persona.getImc().floatValue()));
    }
}
