public class Inventario {
    private Producto[] productos;

    public Inventario(int tamaño) {
        this.productos = new Producto[tamaño];
    }

    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getCodigo().equals(codigo)) {
                productos[i] = null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar(String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                total += productos[i].getCantidad();
            }
        }
        return total;
    }
}
