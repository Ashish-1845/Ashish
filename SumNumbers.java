 public class SumNumbers {
    public static void main(String[] args) {
        
        int n = 10;      // number of terms
        int sum = 0;     // variable to store sum

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of first " + n + " numbers = " + sum);
    }
}