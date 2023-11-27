public class MaxArray {
    public static long maximo(long[] v){
        long max = v[0];
        for(int i = 1; i< v.length; i++)
        if (v[i] > max) max = v[i];
        return max;
    }
    public static void main(String[] args) {
        long [] x = {42,97,31,-25};
        System.out.println(maximo(x));
    }
}
