import java.util.*;

public class Functions {
    public static String dayOfWeek(int a) {
        return switch (a) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "The Weekend";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number::");
        int a = input.nextInt();
        System.out.println(dayOfWeek(a));

    }
}
