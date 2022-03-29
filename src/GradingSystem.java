import java.util.Scanner;
//JAVA ASSIGNMENT
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


        if (req1) {
            System.out.println("Student has passed");
        } else if (req2) {
            System.out.println("Student is condoned");
        } else {
            System.out.println("Student is repeated!");
        }

        if (req1 || req2 && fees == 100) {
            certification = true;
        }

        if (certification) {
            System.out.println("Student is issued a certificate");
        } else {
            System.out.println("Student is not issued a certificate");
        }
    }
}
