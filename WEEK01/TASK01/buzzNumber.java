public class buzzNumber {
    public static boolean buzzzNumberorNot(int n){
        if (n%10 == 7 || n%7 ==0){
            return true;
        }else {
           return false;
        }
     }
     public static void main(String[] args) {
       
        System.out.println(buzzzNumberorNot(57));
     }
}
