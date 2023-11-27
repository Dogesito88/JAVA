public class Producto extends Sucursal {
    private String nombre;
    private float precio;
    private int cantidad;
   
    public Producto(String n, float p, int c){
        nombre =n;
        precio = p;
        cantidad = c;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
            }
    public int getCantidad() {
        return cantidad;
    }
    public void setPrecio(float nuevoPrecio) {
        precio = nuevoPrecio;
    }
    public void setCantidad(float nuevaCantidad) {
        precio = nuevaCantidad;
    }

    public void mostrarDatosProducto( Producto p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Cantidad: " + p.getCantidad());
    }
}