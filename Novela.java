public class Novela extends Libro {
    private String tema;

    public Novela(String t, String a, String tm) {
        super(t,a);
        tema = tm;
    }
        public String getTema() {
        return tema;
    }
    public static void imprimeLibro(Libro l1) {
    System.out.println("Titulo: " + l1.getTitulo());
    System.out.println("Autores: " + l1.getAutores());
    }
}
