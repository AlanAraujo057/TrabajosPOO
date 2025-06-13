public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;


    public String getCodigo() {
        return  codigo;
    }
    public void setCodigo(String codigo) {
        if(codigo !=null){
            this.codigo=codigo;
        }
        else{
            System.out.println("Codigo invalido");
        }
    }

    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        if(cantidad>0){
        this.cantidad = cantidad;
        }else {
            System.out.println("Cantidad no valida");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public boolean agregarProductos(producto){
        if(producto!= null){
            return true;
        }else{
            return false;
        }
    }


}
