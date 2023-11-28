public class LibroTexto extends Libro {
    private String curso;

    public LibroTexto(String t, String a, String c) {
        super(t,a);
        curso = c;
    }
    public String getCurso() {
        return curso;
    }
        
    public void imprimeLibro(LibroTexto l1) {
        super.imprimeLibro(l1);
        System.out.println("Curso: " + l1.getCurso());
        }

}

