public class Acuarela extends Pintura {
        private String pigmentacion;
        
        public Acuarela(String t, String a, String tc, short s, String p){ 
        super(t,a,tc,s);
        pigmentacion = p;
    }
    public String getPigmentacion(){
        return pigmentacion;
    }
    public void mostrarPintura(Acuarela a){
        super.mostrarPintura(a);
        System.out.println("Pigmentación: " + a.getPigmentacion());
    }
    
    }
