import java.util.*;
public class StudentMarks {

    public static void main (String[] args) {
        int maths, physics, chemistry, computerScience;
        int numOfSubjects;
        double finalScore, sum = 0.0;
        boolean moreStudent;
        Scanner readInput = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        numOfSubjects = readInput.nextInt();
        double[] subjects = new double[numOfSubjects];
        System.out.println("Enter the marks one by one:: ");
        for (int i =0; i<numOfSubjects; i++) {
            subjects[i] = readInput.nextDouble();
            sum += subjects[i];
        }
        finalScore = sum / numOfSubjects;
        System.out.println("The final score is: " + finalScore);

//        do
//        {
//            System.out.println("Enter marks for Physics: ");
//            physics = readInput.nextInt();
//            System.out.println("Enter marks for Chemistry: ");
//            chemistry = readInput.nextInt();
//            System.out.println("Enter marks for Maths: ");
//            maths = readInput.nextInt();
//            System.out.println("Enter marks for Computer Science: ");
//            computerScience = readInput.nextInt();
//
//            finalScore = (maths+physics+chemistry+computerScience) / 4.0;
//            System.out.println("Final Average: " + finalScore);
            if (finalScore >= 90) {
                System.out.println("Distinction");
            }
            else if (finalScore >=80) {
                System.out.println("Excellent");
            }
            else if (finalScore >=70) {
                System.out.println("Very Good");
            }
            else if (finalScore >= 60) {
                System.out.println("Good");
            }
            else if (finalScore >= 50) {
                System.out.println("Average");
            }
            else if (finalScore >= 40){
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
            System.out.println("Any more students?: ");
            moreStudent = readInput.nextBoolean();
            if (moreStudent){
                return;
            }

//        }
    }
}

