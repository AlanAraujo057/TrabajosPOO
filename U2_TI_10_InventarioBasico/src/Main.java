public class Main {
    public static void main(String[] args) {

        Inventario inventario = new Inventario(3);

        Producto producto1 = new Producto("AWSD", "Jabon", 3);
        Producto producto2 = new Producto("BWDF", "Galletas", 5);
        Producto producto3 = new Producto("LKJL", "Cloro", 2);
        Producto producto4 = new Producto("QQES", "Papel de baño", 1);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        System.out.println("Total de items agregados al invetario: " +inventario.totalItems());

        inventario.buscar("AWSD");
        inventario.buscar("AAAQ");

        inventario.eliminarProducto("BWDF");
        System.out.println("Producto eliminado: " +producto2.nombre()+" ,Total items: "+ inventario.totalItems());

        inventario.agregarProducto(producto2);
        System.out.println("El total de items despues de agregar nuevamente el producto es: "+ inventario.totalItems());
    }
}
