import java.util.Scanner;
public class StudentsScore {
    public static void main(String[] args) {
        int mark;
        char Grade;
        Scanner readLine = new Scanner(System.in);
        System.out.println("Enter Student's mark::");
        mark = readLine.nextInt();
        if (mark >=80) {
            Grade = 'A';
        } else if (mark >=70) {
            Grade = 'B';
        } else if (mark >=60) {
            Grade = 'C';
        } else if (mark >= 50) {
            Grade = 'D';
        } else if (mark >=40) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }
        System.out.println("Grade:: " + Grade);
    }
}
