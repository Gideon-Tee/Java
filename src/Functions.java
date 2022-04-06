import java.util.*;

public class Functions {
    // CALCULATE THE COMBINATION OF TWO NUMBERS USING FUNCTIONS!
    private static int factoral(int n) {
        int fact =1;
        for (int i =1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers a and b (a combination b)");
        int a = input.nextInt();
        int b = input.nextInt();
        while (a < b) {
            System.out.println("Enter valid values");
            a = input.nextInt();
            b = input.nextInt();
        }
        int combination = factoral(a) / (factoral(a-b) * factoral(b));
        System.out.println(a + " combination "+ b +" is " + combination);
    }



    // BOOLEAN FUNCTION TO RETURN IF A NUMBER IS EVEN OR NOT
//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number");
//        int num = input.nextInt();
//        System.out.println(isEven(num));
//    }



// FUNCTION WITH SWITCH STATEMENT TO RETURN THE DAY NAME WHEN DAY NUMBER IS ENTERED!
//    public static String dayOfWeek(int a) {
//        return switch (a) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            default -> "The Weekend";
//        };
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter day number::");
//        int a = input.nextInt();
//        System.out.println(dayOfWeek(a));
//
//    }
}
