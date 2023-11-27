public class ProductoOrtodoncia extends Producto {
    private String marca;
    private int caducidad;

    public ProductoOrtodoncia (String n, float p, int c, String m, int cd){
        super(n, p, c);
        marca = m;
        caducidad = cd;
    }
    public int getCaducidad() {
        return caducidad;
    }
    public String getMarca() {
        return marca;
    }
    public void mostrarDatosProducto( ProductoOrtodoncia po) {
        super.mostrarDatosProducto(po);
        System.out.println("Marca: " + po.getMarca());
        System.out.println("Caducidad: " + po.getCaducidad());
    }
}
