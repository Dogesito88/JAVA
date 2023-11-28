public class Novela extends Libro {
    private String tema;

    public Novela(String t, String a, String tm) {
        super(t,a);
        tema = tm;
    }
        public String getTema() {
        return tema;
    }
    public void imprimeLibro(Novela l1) {
        super.imprimeLibro(l1);
        System.out.println("Tema: " + l1.getTema());
    }
}
