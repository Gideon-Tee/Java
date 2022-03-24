import java.util.*;

public class CalculateCWA {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int numOfCourses, totalCreditHours = 0, trails = 0;
        String StudentClass;
        double CWA, weightedMarks = 0;
        System.out.println("Enter number of courses::");
        numOfCourses = readInput.nextInt();
        // Read in the values for the marks and their corresponding credit hours
        double[] marks = new double[numOfCourses];
        int[] creditHours = new int[numOfCourses];
        System.out.println("Enter the mark for each subject::");
        for (int i = 0; i < numOfCourses; i++) {
            marks[i] = readInput.nextDouble();
//            sumOfMarks += marks[i];
            if (marks[i] < 40) {
                trails++;
            }
        }
        System.out.println("Enter the corresponding credit hours");
        for (int i = 0; i < numOfCourses; i++) {
            creditHours[i] = readInput.nextInt();
            totalCreditHours += creditHours[i];
        }
        for (int i = 0; i < numOfCourses; i++) {
            weightedMarks += marks[i] * creditHours[i];
        }
        CWA = weightedMarks / totalCreditHours;

        if (CWA >= 70) {
            StudentClass = "First class";
        } else if (CWA >= 60) {
            StudentClass = "Second Class Upper";
        } else if (CWA >= 50) {
            StudentClass = "Second Class Lower";
        } else if (CWA >= 40) {
            StudentClass = "Pass";
        } else {
            StudentClass = "Fail";
        }

        System.out.println("Weighted marks::  " + weightedMarks);
        System.out.println("Credit Hours::    " + totalCreditHours);
        System.out.println("The CWA::         " + CWA);
        System.out.println("Class::           " + StudentClass);
        System.out.println("Trails::          " + trails);

    }

}
