public class Pintura {
    private String titulo;
    private String autor;
    private String tecnica;
    private short stock;

public Pintura(String t, String a, String tc, short s){
titulo = t;
autor = a;
tecnica = tc;
stock = s;
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
public String getTecnica(){
    return tecnica;
}
public short getStock(){ 
    return stock;
}  
public void setStock(short nuevoStock){
    stock = nuevoStock;
}

public static void mostrarPintura(Pintura p){ 
    System.out.println("Titulo: "+ p.getTitulo());
    System.out.println("Autor: "+ p.getAutor());
    System.out.println("Tecnica: "+ p.getTecnica());
}

public static void mostrarStock(Pintura p){ 
    System.out.println("Titulo: "+ p.getTitulo());
    System.out.println("Autor: "+ p.getAutor());
    System.out.println("Stock: "+ p.getStock());
}

}



