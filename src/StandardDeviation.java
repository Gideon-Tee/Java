import java.util.*;
import java.lang.Math;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        int numItems;
        double sum = 0, mean, variance = 0;
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
            variance += (values[i] - mean) * (values[i] - mean);
        }
        variance = variance / numItems;
        double standardDeviation = Math.sqrt(variance);

        System.out.println("Standard deviation is:: " + standardDeviation);
        System.out.println("Variance is:: " + variance);
    }

}
