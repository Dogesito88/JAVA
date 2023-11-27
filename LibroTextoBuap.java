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
    public static void imprimeLibro(Libro l1) {
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autores: " + l1.getAutores());
        }
}

