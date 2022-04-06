import java.util.Scanner;
public class Twin_Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lastnum, factors =0;
        System.out.println("Enter the last number::");
        lastnum = input.nextInt();
        int [] primes = new int[lastnum];
        for (int i=2; i<=lastnum; i++) {
            for (int j=2; j<i; j++) {
                 if(i%j == 0) {
                     factors ++;
                 }
            }
            if (factors ==0) {
                for (int k=0; k<lastnum; k++) {
                    primes[k] = i;
                }
            }
        }
        for (int x=0; x<lastnum; x++) {
            System.out.print(primes[x]);
        }
    }
}
