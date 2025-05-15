public class fibonacci {
    public static int Fib (int n ){
        if (n==0 || n==1){
            return n;
        }
        int Fnm1 = Fib (n-1);
        int Fnm2 = Fib (n-2);
        int FN = Fnm1 + Fnm2;
        return FN ; 
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(Fib(n));
    }
}
