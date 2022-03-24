import java.util.*;
public class Reverse_factorial {
    public static void main(String[] args) {
        Scanner readline = new Scanner(System.in);
        int i, factorial=1, num;
        System.out.println("Enter the number:: ");
        num = readline.nextInt();
        for (i=1; i<num; i++) {
            factorial *= i;
            if (factorial == num) {
                break;
            }
        }
        System.out.println(num + " is the factorial of " + i);
    }

}
