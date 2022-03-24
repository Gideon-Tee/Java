import java.util.*;
import java.lang.Math;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        int numItems;
        double sum = 0, mean, meanDifferenceSum = 0;
        System.out.println("Enter number of items::");
        numItems = readLine.nextInt();
        double[] values = new double[numItems];
        System.out.println("Enter the numbers::");
        for (int i = 0; i < numItems; i++) {
            values[i] = readLine.nextDouble();
            sum += values[i];
        }
        mean = sum / numItems;
        for (int i = 0; i < numItems; i++) {
            meanDifferenceSum += (values[i] - mean) * (values[i] - mean);
        }
        meanDifferenceSum = meanDifferenceSum / numItems;
        double standardDeviation = Math.sqrt(meanDifferenceSum);

        System.out.println("Standard deviation is:: " + standardDeviation);
    }

}
