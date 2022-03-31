import java.util.Scanner;
public class GradingSystem_with_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int check;
        do {
            System.out.println("====================================");
            System.out.println("Press (1) to continue or (0) to stop");
            System.out.println("====================================");
            check = in.nextInt();
            System.out.println("Enter exams score");
            int examScore = in.nextInt();
            System.out.println("Enter assessment score");
            int assessment = in.nextInt();
            System.out.println("Enter fees paid");
            int fees = in.nextInt();
            String studentState;
            boolean req1 = examScore >= 25 && assessment >= 15;
            boolean req2 = (examScore == 24 && assessment == 15) || (examScore == 25 && assessment == 14);


            if (req1) {
                studentState = "passed";
            } else if (req2) {
                studentState = "condoned";
            } else {
                studentState = "failed";
            }
            switch (studentState) {
                case "passed", "condoned" -> {
                    System.out.println("Student " + studentState);
                    if (fees == 100) {
                        System.out.println("Student is issued a certificate");
                    } else {
                        System.out.println("Student is not issued a certificate");
                    }
                }
                default -> System.out.println("Student has failed");

            }
        } while (check > 0);
    }
}
