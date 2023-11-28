public class LibroTextoBUAPProgramacion extends LibroTextoBuap {
    private String semestre;
    public LibroTextoBUAPProgramacion(String t, String a, String c, String f, String s) {
        super(t,a, c,f);
        semestre = s;
    }
    public String getSemestre() {
        return semestre;
    }
    public void imprimeLibro(LibroTextoBUAPProgramacion l1) {
        super.imprimeLibro(l1);
        System.out.println("Semestre: " + l1.getSemestre());
        }
}