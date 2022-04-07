import java.util.Scanner;

public class Twin_Primes {
    private static boolean isPrime(int a) {
        int factors=0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                factors++;
            }
        }
        return factors==0;
    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int lastnum;
        System.out.println("Enter the last number::");
        lastnum = input.nextInt();
        for (int i=2; i<=lastnum; i++) {
            if (isPrime(i) && isPrime((i+2))) {
                System.out.println(i + " and " + (i+2));

            }
        }
    }
}

