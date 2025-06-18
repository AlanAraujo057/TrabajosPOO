public class Garaje {
    private Vehiculo[] vehiculos;

    public Garaje(int numEspacios) {
        this.vehiculos = new Vehiculo[numEspacios];
    }

    public boolean estacionar(Vehiculo vehiculo) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String placa) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].getPlaca().equals(placa)) {
                vehiculos[i] = null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos() {
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            if (v != null) {
                contador++;
            }
        }
        return contador;
    }
}
