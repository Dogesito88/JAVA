    import javax.swing.JOptionPane;
public class LibroArray{
  public static void main(String[] args) {
          Libro[] libroarray = new Libro[7];
    int opc,i,num=0;
    int continuar;

    do{
       do{

          String op = JOptionPane.showInputDialog(" 1 :Libro de Texto" + "\n" + " 2 :Libro Texto perteneciente a BUAP" + "\n" + " 3 :Libro Texto perteneciente a BUAP sobre Programación"
                  + "\n" + " 4 :Novela" + "\n" + " 5 :Novela Literaria" + "\n" + " 6 :Novela Literaria Corta" + "\n" + " 7 :Cuento");
          opc = Integer.parseInt(op);
          switch(opc){

                           case 1:
                        libroarray [num]= new LibroTexto 
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"),
                        JOptionPane.showInputDialog("Curso"));
            break;

                           case 2:
                           libroarray [num]= new LibroTextoBuap 
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"), 
                        JOptionPane.showInputDialog("Curso"),
                        JOptionPane.showInputDialog("Facultad"));
                        break;

                        case 3:
                           libroarray [num]= new LibroTextoBUAPProgramacion 
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"), 
                        JOptionPane.showInputDialog("Curso"),
                        JOptionPane.showInputDialog("Facultad"),
                        JOptionPane.showInputDialog("Semestre"));
                        break;

                        case 4:
                           libroarray [num]= new Novela
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"), 
                        JOptionPane.showInputDialog("Tema"));
                        break;

                        case 5:
                           libroarray [num]= new NovelaLiteraria 
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"), 
                        JOptionPane.showInputDialog("Tema"),
                        JOptionPane.showInputDialog("Epoca"));
                        break;

                        case 6:

                        libroarray [num]= new NovelaLiterariaCorta 
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"), 
                        JOptionPane.showInputDialog("Tema"),
                        JOptionPane.showInputDialog("Epoca"),
                        JOptionPane.showInputDialog("Extensión"));
                        break;

                        case 7:
                            
                        libroarray [num]= new Cuento 
                        (JOptionPane.showInputDialog("Título"),
                        JOptionPane.showInputDialog("Autores"), 
                        JOptionPane.showInputDialog("Género"));
            break;

                               default:
                                JOptionPane.showMessageDialog(null,  "Opción no valida");

                   }

                   }while((opc < 1) && (opc > 7));
                   num=num+1;

           continuar= JOptionPane.showConfirmDialog(null,"¿Desea añadir otro Libro?","Recabando información",JOptionPane.YES_NO_OPTION);

          }while(continuar==JOptionPane.YES_OPTION);

         for (i=0;i<num;i++)
                     {
                System.out.print(libroarray[i]);
                                Libro.imprimeLibro(libroarray[i]);
                   }
        }
}
