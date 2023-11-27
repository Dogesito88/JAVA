//ejercicio 5
class Persona {
    private String nombre;
    private String residencia;

    public Persona(String n, String r) {
        nombre = n;
        residencia = r;
    }
    public String getNombre() {
        return nombre;
    }
    public String getResidencia() {
        return residencia;
    }
    public void setResidencia(String nuevaResidencia) {
        residencia = nuevaResidencia;
    }
    public void mostrarDatos( Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Residencia: " + p.getResidencia());
    }
}