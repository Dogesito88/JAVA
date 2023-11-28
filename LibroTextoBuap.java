public class LibroTextoBuap extends LibroTexto {
    private String facultad;
    public LibroTextoBuap(String t, String a, String c, String f) {
        super(t,a, c);
        facultad = f;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String nuevaFacultad) {
        facultad = nuevaFacultad;
    }
    public void imprimeLibro(LibroTextoBuap l1) {
        super.imprimeLibro(l1);
        System.out.println("Facultad: " + l1.getFacultad());
        }
}

