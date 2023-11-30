import java.util.Scanner;
public class CalcularPrecioLibro {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Cantidad de libros: ");
    int n = scanner.nextInt();
    float[] v = new float[n];
    float  suma = 0;

  for(int i = 0; i< v.length; i++){  
    System.out.println("Precio de libro " +(i + 1)+ ": ");
    v[i] = scanner.nextFloat();
    suma = suma+ v[i]; 
    System.out.println("Precio Actual: " + suma);
  
     }
     System.out.println("Precio final: " + suma);
       scanner.close();
}
    
}
