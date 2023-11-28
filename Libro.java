public class Libro {
    private String titulo;
    private String autores;
    private double precio;

    public Libro(String t, String a){
        titulo = t;
        autores= a;
    }
public String getTitulo() {
return titulo;
}
public String getAutores() {
return autores;
}
public double getPrecio() {
return precio;
}
public void setPrecio(double nuevoPrecio) {
    precio = nuevoPrecio;
}
public static void imprimeLibro(Libro l1) {
    System.out.println("");
    System.out.println("Titulo: " + l1.getTitulo());
    System.out.println("Autores: " + l1.getAutores());
    }
    public static void imprimePrecioLibro(Libro l1) {
    System.out.println("Titulo: " + l1.getTitulo());
    System.out.println("Autores: " + l1.getAutores());
    System.out.println("Precio: " + l1.getPrecio());
    }
}    
