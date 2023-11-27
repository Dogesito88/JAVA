//ejercicio 5
class Estudiante extends Persona {
    private String facultad;
    private float pagoInscripcion;
        
    public Estudiante(String n, String r, String f, float pi) {
        super(n,r);
        facultad = f;
        pagoInscripcion = pi;      
    }
    public String getFacultad() {
        return facultad;
    }
    public float getPagoInscripcion() {
        return pagoInscripcion;
    }
    public void setFacultad(String nuevaFacultad) {
        facultad = nuevaFacultad;
    }
    public void setPagoInscripcion(float nuevoPagoInscripcion) {
        pagoInscripcion = nuevoPagoInscripcion;
    }
    public void mostrarDatos(Estudiante e) {
        super.mostrarDatos(e); 
        System.out.println("Facultad: " + e.getFacultad());
        System.out.println("Pago de Inscripción: " + e.getPagoInscripcion());
    }   
    public float pagoCuotaSS(float pagoInscripcion) {
        return 0.10f * pagoInscripcion;
    }
}