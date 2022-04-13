public class Exams_Scores_Midsem {
    public static void main(String[] args) {
        int[] raw_midsem = {65,48,22,32,80,12,45,25,33,67,23,45,56,34,81};
        int[] raw_exam = {78,54,90,32,66,60,48,65,45,56,33,45,67,90,67};
        int[] indexNums = {10021007,10021107,10021207,10021307,10021407,10021507,10021607,10021707,10021807,10021907,10022007,10022107,10022207,10022307,10022407};
        double[] finalScores = new double[15];
        char grade;
        int A=0,B=0,C=0,D=0,F=0;
        double max, min, sum=0, average;

        System.out.println("INDEX NUMBER::      FINAL SCORE         GRADE");
        for (int i=0; i<15; i++) {
            double finalMidsem = raw_midsem[i] / 100.0 * 30.0;
            double finalExam = (raw_exam[i] / 100.0) * 70;
            finalScores[i] = finalExam + finalMidsem;
            sum += finalScores[i];

            if (finalScores[i] >=70) {
                grade = 'A'; A++;
            } else if (finalScores[i]>=60) {
                grade = 'B'; B++;
            } else if (finalScores[i] >=50) {
                grade = 'C'; C++;
            } else if (finalScores[i] >= 40) {
                grade = 'D'; D++;
            } else {
                grade = 'F'; F++;
            }

            System.out.print( indexNums[i]  +"              ");
            System.out.printf("%.2f", finalScores[i] );
            System.out.print("                  "+grade);
            System.out.println(" ");

        }
        max = finalScores[0];
        min = finalScores[0];
        for (int i=1; i<15; i++) {
            if (finalScores[i] >= max) {
                max = finalScores[i];
            }
            if (finalScores[i] <= min) {
                min = finalScores[i];
            }
        }
        average = sum / 15;
        System.out.println("\nmaximum:: " + max);
        System.out.println("minimum:: " + min);
        System.out.printf("average::  %2f",average);
        System.out.println(" \n");
        System.out.println("Frequency of Grade A:: " + A);
        System.out.println("Frequency of Grade B:: " + B);
        System.out.println("Frequency of Grade C:: " + C);
        System.out.println("Frequency of Grade D:: " + D);
        System.out.println("Frequency of Grade F:: " + F);
    }
}
