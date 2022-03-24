import java.util.Scanner;
public class SingleArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] ages = new int[2][3];
        System.out.println("Enter your values::");
        for (int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                ages[i][j] = input.nextInt();
            }
        }

        for (int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(ages[i][j] + " ");
            }
        }


    }
}
