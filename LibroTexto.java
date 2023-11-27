public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String t, String a, String c) {
        super(t,a);
        curso = c;
    }
    public String getCurso() {
        return curso;
    }
        
    public static void imprimeLibro(Libro l1) {
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autores: " + l1.getAutores());
        }

}

