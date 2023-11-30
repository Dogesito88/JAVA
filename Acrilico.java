public class Acrilico extends Pintura {
    private String base;
    
    public Acrilico(String t, String a, String tc, short s, String b){ 
    super(t,a,tc,s);
    base = b;
}
public String getBase(){
    return base;
}
public void mostrarPintura(Acrilico ac){
    super.mostrarPintura(ac);
    System.out.println("Base: " + ac.getBase());
}
}
