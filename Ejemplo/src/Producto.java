public class Producto {
    private String nombre;
    private int precio;
    private int cantidad;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public Double calcularTotal(double precio,  int cantidad){
        return cantidad*precio;
    }
    public Double descuentoTotal(){
        return
    }
}
