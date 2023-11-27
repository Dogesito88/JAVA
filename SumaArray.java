public class SumaArray {
    public static int sumaValores(int[] v) { 
        int suma = 0; 
        for (int i = 0; i< v.length; i++)
        suma = suma+v[i]; 
        return suma; 
    }
    public static void main(String[] args) {
        int[] x = new int[5];  // Se crea un arreglo de enteros con longitud 5

        // Se llena el arreglo con valores que son el doble del índice de cada elemento

        for (int i = 0; i < x.length; i++)
        x[i]= 2*i;
        System.out.println(sumaValores(x));
    }
    
}
