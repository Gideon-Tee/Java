import java.util.Scanner;

public class Hello {
    public static void main(String arg[]) {
        System.out.println("Hello World");
        Scanner readLine = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:: ");
        name = readLine.next();

        System.out.println("Hello " + name);

    }
}
