//ejercicio 9
import javax.swing.JOptionPane;
public class ProgramaPrincipalTeclado {
        public static void main(String[] args) {
            Persona p = new Persona(JOptionPane.showInputDialog("Nombre"),JOptionPane.showInputDialog("Residencia"));
            Estudiante e = new Estudiante(JOptionPane.showInputDialog("Nombre"),JOptionPane.showInputDialog("Residencia"),JOptionPane.showInputDialog("Facultad"),Float.parseFloat(JOptionPane.showInputDialog("Pago Inscripcion")));
            Catedratico c = new Catedratico(JOptionPane.showInputDialog("Nombre"), JOptionPane.showInputDialog("Residencia"),JOptionPane.showInputDialog("Facultad"), Float.parseFloat(JOptionPane.showInputDialog("Pago Inscripcion")));
    
            // Mostrar datos originales
            System.out.println("Datos originales:");
            p.mostrarDatos(p);
            e.mostrarDatos(e);
            c.mostrarDatos(c);
    
            // Cambiar datos
            p.setResidencia(JOptionPane.showInputDialog("Nueva residencia"));
            e.setPagoInscripcion (Float.parseFloat(JOptionPane.showInputDialog("Nuevo Pago inscripción")));
            c.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Nuevo Salario")));
    
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

