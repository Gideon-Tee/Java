//import java.util.Scanner;
public class Switch_Test_Case {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter value::");
//        int num = in.nextInt();
        for (int i=1; i<12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println(i + " is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(i + " is less than 10");
                    break;
                default:
                    System.out.println(i + " is 10 or more");
            }
        }

    }
}
