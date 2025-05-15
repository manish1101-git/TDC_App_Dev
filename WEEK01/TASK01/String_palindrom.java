public class String_palindrom {
    public static boolean ispalindromorNot(String str){
        for(int i =0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecaer";
        System.out.println(ispalindromorNot(str));
    }
}
