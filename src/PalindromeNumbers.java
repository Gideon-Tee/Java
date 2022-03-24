import java.util.*;
public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int remainder, sum=0;
        System.out.println("Enter number::");
        int num = in.nextInt();
        int temp = num;
        while (num>0) {
            remainder = num % 10;
            sum = (sum*10) + remainder;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }
}
