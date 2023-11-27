//ejercicio 5
class Catedratico extends Persona {
    private String facultad;
    private float salario;

    public Catedratico(String n, String r, String f, float s) {
        super(n, r);
        facultad = f;
        salario = s;
    }
    public String getFacultad() {
        return facultad;
    }
    public float getSalario() {
        return salario;
    }
    public void setFacultad(String nuevaFacultad) {
        facultad = nuevaFacultad;
    }
    public void setSalario(float nuevoSalario) {
        salario = nuevoSalario;
    }    
    public void mostrarDatos(Catedratico c){
        super.mostrarDatos(c);
        System.out.println("Facultad: " + c.getFacultad());
        System.out.println("Salario: " + c.getSalario());
    }
    public float pagoCuotaSS(float salario) {
        return 0.15f * salario;
    }
}