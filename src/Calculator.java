import java.util.*;
public class Calculator {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        char op;
        System.out.print("Enter the two numbers::  ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.print("Enter the operation type::  ");
        op = input.next().charAt(0);
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op =='/') {
            result = num1 / num2;
        } else if (op == '-'){
            result = num1 - num2;
        } else {
            System.out.println("Invalid operation");

        }

    }

}
