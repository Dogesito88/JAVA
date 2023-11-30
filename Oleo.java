public class Oleo extends Pintura {
    private String textura;
    
    public Oleo(String t, String a, String tc, short s, String tx){ 
    super(t,a,tc,s);
    textura = tx;
}
public String getTextura(){
    return textura;
}
public void mostrarPintura(Oleo o){
    super.mostrarPintura(o);
    System.out.println("Textura: " + o.getTextura());
}

}


