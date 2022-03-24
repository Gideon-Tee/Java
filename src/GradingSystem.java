import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter exams score");
        int examScore = in.nextInt();
        System.out.println("Enter assessment score");
        int assessment = in.nextInt();
        System.out.println("Enter fees paid");
        int fees = in.nextInt();
        boolean certification = false;
        boolean req1 = examScore >= 25 && assessment >= 15;
        boolean req2 = (examScore == 24 && assessment == 15) || (examScore == 25 && assessment == 14);

        if (req1 || req2 && fees == 100) {
            certification = true;
        }
        if (req1) {
            System.out.println("You have met requirement 1");
        } else if (req2) {
            System.out.println("You have passed requirement 2 but have failed requirement 1");
        } else {
            System.out.println("You are repeated!");
        }
        if (certification) {
            System.out.println("You have been issued a certificate");
        }
    }
}
