public class NovelaLiteraria  extends Novela{
    private String epoca;

    public NovelaLiteraria(String t, String a, String tm, String e) {
        super(t,a, tm);
        epoca = e;
    }
        public String getEpoca() {
        return epoca;
    }
    public void imprimeLibro(NovelaLiteraria l1) {
        super.imprimeLibro(l1);
        System.out.println("Epoca: " + l1.getEpoca());

    }
}

