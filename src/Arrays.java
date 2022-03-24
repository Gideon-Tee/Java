import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        double[][] array = new double[2][2];
        System.out.println("Enter the values for the array::");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                array[i][j] = readLine.nextDouble();
            }
        }
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(array[i][j] + "  ");
            }
        }
    }
}
