public class Cuento extends Libro {
    private String genero;

    public Cuento(String t, String a, String g) {
        super(t,a);
        genero = g;
    }
        public String getGenero() {
        return genero;
    }
    public void imprimeLibro(Cuento l1) {
    super.imprimeLibro(l1);
    System.out.println("Genero: " + l1.getGenero());
    }
}