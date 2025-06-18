public class Main {
    public static void main(String[] args) {
        Garaje garaje = new Garaje(4);

        Coche coche1 = new Coche("AWSD057", "Jetta", 4);
        Coche coche2 = new Coche("QRT607", "Chevy", 2);
        Motocicleta moto1 = new Motocicleta("NMSO33", "Vento", false);
        Motocicleta moto2 = new Motocicleta("HGJOO32", "BMW", true);

        garaje.estacionar(coche1);
        garaje.estacionar(coche2);
        garaje.estacionar(moto1);
        garaje.estacionar(moto2);

        garaje.retirar(coche1.getPlaca());

        System.out.println("Número de vehículos en el garaje: " + garaje.contarVehiculos());

    }
}
