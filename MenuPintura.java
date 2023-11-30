import javax.swing.JOptionPane;
public class MenuPintura {
public static void main (String[] args){
    Pintura [] p = new Pintura[3];
    int opc, i, num =0;
    int continuar;
    do{
        do{
            String op = JOptionPane.showInputDialog("1: Oleo"+ "\n"+"2:"+"\n"+"3:");
            opc = Integer.parseInt(op);
            switch (opc) {
                case 1:
                    p [num]= new Oleo
                    (JOptionPane.showInputDialog("t"),
                    JOptionPane.showInputDialog("a"),
                    JOptionPane.showInputDialog("tc"),
                    Short.parseShort(JOptionPane.showInputDialog("s")),
                    JOptionPane.showInputDialog("tx"));
                    
                    break;
                    case 2:
                    new Acuarela
                    (JOptionPane.showInputDialog("t"),
                    JOptionPane.showInputDialog("a"),
                    JOptionPane.showInputDialog("tc"),
                    Short.parseShort(JOptionPane.showInputDialog("s")),
                    JOptionPane.showInputDialog("p"));

                    break;
                    case 3:                              
                    new Acrilico
                    (JOptionPane.showInputDialog("t"),
                    JOptionPane.showInputDialog("a"),
                    JOptionPane.showInputDialog("tc"),
                    Short.parseShort(JOptionPane.showInputDialog("s")),
                    JOptionPane.showInputDialog("b"));
                    break;
                
                default:
                  JOptionPane.showMessageDialog(null, "Tonto");
            }
        }while ((opc < 1 ) && (opc <3)); 
                num= num+1; 
            
            continuar = JOptionPane.showConfirmDialog(null, "Meter otro dato? ", "leer", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);
            for( i= 0; i<num; i++)
            {
                System.out.println(p[i]);
                Pintura.mostrarPintura(p [i]);
            }
            
         }   
         
}
    

        
