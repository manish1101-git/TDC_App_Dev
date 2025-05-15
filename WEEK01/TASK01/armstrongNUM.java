public class armstrongNUM {
    public static void ArmsrongNUmberorNot(int num){
        int n = String.valueOf(num).length();
        int sum = 0;
        int originalNum = num;
        while (num>0){
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;  
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
    public static void main(String[] args) {
        
        ArmsrongNUmberorNot(1553);
    }
}
