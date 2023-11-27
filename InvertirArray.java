public class InvertirArray {
 public static void invierte(int[] v){
        for(int i = 0; i < v.length/2; i++){
        int temp;    
        temp = v[i];
        v[i] = v[v.length-1-i];
        v[v.length-1-i] = temp;
        }
        }
    public static void main(String[] args) {
        int[] x = { 5, 3, 9, 5, 12};
        for (int i = 0; i < 5; i++)
        System.out.println(x[i]);
        invierte(x);
        for (int i = 0; i<5; i++)
        System.out.println(x[i]);
    }
}
