import java.util.*;
import java.lang.Math;
public class DotProduct {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int rows;
        double dotProduct =0.0, mag_vector1=0, mag_vector2=0, degrees, radians;
        System.out.println("Enter number of rows::");
        rows = readInput.nextInt();
        double[] vector1 = new double[rows];
        double[] vector2 = new double[rows];
        // Read in values for the vectors
        System.out.println("Enter the values of the first vector::");
        for (int i=0; i<rows; i++) {
            vector1[i] = readInput.nextDouble();
        }

        System.out.println("Enter the values of the second vector::");
        for (int i=0; i<rows; i++) {
            vector2[i] = readInput.nextDouble();
        }
        // Calculate the product for the two vectors
        for (int i=0; i<rows; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        // calculate the magnitude of vector 1
        for (int i=0; i<rows; i++) {
            mag_vector1 += vector1[i] * vector1[i];
        }
        mag_vector1 = Math.sqrt(mag_vector1);
        // calculate the magnitude of vector 2
        for (int i=0; i<rows; i++) {
            mag_vector2 += vector2[i] * vector2[i];
        }
        mag_vector2 = Math.sqrt(mag_vector2);

        // calculate the angle between the two vectors
        degrees = Math.acos((dotProduct) / (mag_vector1 * mag_vector2));
        radians = Math.toRadians(degrees);

        System.out.println("Dot Product:: " + dotProduct);
        System.out.println("Angle in degrees:: " + degrees);
        System.out.println("Angle in radians::  " + radians);

    }

}
