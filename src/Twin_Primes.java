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
        int lastNum;
        System.out.println("Enter the last number::");
        lastNum = input.nextInt();
        System.out.println("TWIN PRIMES");
        for (int i=2; i<=lastNum; i++) {
            if (isPrime(i) && isPrime((i+2)) && ((i+2) <= lastNum))  {
                System.out.println(i + " and " + (i+2));

            }
        }
    }
}

