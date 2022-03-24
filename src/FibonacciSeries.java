import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        int firstNum, secNum, numOfItems;
        System.out.println("Enter the first two numbers:");
        firstNum = readInput.nextInt();
        secNum = readInput.nextInt();
        System.out.println("Number of items in the series:");
        numOfItems = readInput.nextInt();
        int[] series = new int[numOfItems];
//        series[numOfItems] = (firstNum+secNum);
        series[0] = firstNum;
        series[1] = secNum;
        for (int i=2; i<numOfItems; i++) {
            series[i] = series[i-1] + series[i-2];

        }
        System.out.println("The Fibonacci Series::");
        for (int i =0; i<numOfItems; i++) {
            System.out.print(series[i] + "  ");
        }

    }
}
