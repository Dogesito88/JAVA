public class ProductoMedicamento extends Producto{
        private String marca;
        private int caducidad;
    
        public ProductoMedicamento (String n, float p, int c, String m, int cd){
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
        public void mostrarDatosProducto( ProductoMedicamento pm) {
            super.mostrarDatosProducto(pm);
            System.out.println("Marca: " + pm.getMarca());
            System.out.println("Caducidad: " + pm.getCaducidad());
        }
    }
