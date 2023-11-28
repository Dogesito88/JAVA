public class NovelaLiterariaCorta  extends NovelaLiteraria{
    private String extension;

    public NovelaLiterariaCorta(String t, String a, String tm, String e, String ex) {
        super(t,a, tm, e);
        extension = ex;
    }
        public String getExtension() {
        return extension;
    }
    public void imprimeLibro(NovelaLiterariaCorta l1) {
        super.imprimeLibro(l1);
        System.out.println("Extensión: " + l1.getExtension());
    }
}

