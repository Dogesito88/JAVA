//ejercicio 5
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", "Ciudad A");
        Estudiante e = new Estudiante("Maria", "Ciudad B", "Facultad de Ciencias", 1500);
        Catedratico c = new Catedratico("Carlos", "Ciudad C", "Facultad de Artes", 3000);

        // Mostrar datos originales
        System.out.println("Datos originales:");
        p.mostrarDatos(p);
        e.mostrarDatos(e);
        c.mostrarDatos(c);

        // Cambiar datos
        p.setResidencia("Ciudad X");
        e.setPagoInscripcion(2000);
        c.setSalario(3500);

        // Mostrar datos actualizados
        System.out.println("\nDatos actualizados:");
        p.mostrarDatos(p);
        e.mostrarDatos(e);
        c.mostrarDatos(c);

        // Calcular y mostrar cuotas de Seguro Social
        System.out.println("\nCuotas de Seguro Social:");
        System.out.println("Cuota de Seguro Social de Estudiante: " + e.pagoCuotaSS(e.getPagoInscripcion()));
        System.out.println("Cuota de Seguro Social de Catedrático: " + c.pagoCuotaSS(c.getSalario()));
    }
}