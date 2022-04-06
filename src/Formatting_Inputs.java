import java.util.Scanner;
public class Formatting_Inputs {
    public static void main(String[] args) {
        // use printf instead of print/println to format inputs
        System.out.printf("%d", 10); // "%d" looks for INTEGER
        System.out.printf("%3f", 10.21); // looks for floating point values
        System.out.printf("%c", 'a'); // prints the character a
        System.out.printf("%C", 'a'); // prints the character in upper case
        System.out.printf("%s", "Gideon"); // prints string and %S prints the string in uppercase
        System.out.printf("%b", 5<3); // prints boolean values
        System.out.printf("%e", 10.254); //scientific notation e
        System.out.printf("%g", 1000.22); // represents in decimal format but in scientific when exponent is greater than 6 and less than -4
        System.out.printf("%o", 10); // takes the number beside it and prints it's octal value
        System.out.printf("%x", 11); // prints in hexadecimal form
        System.out.printf("%h", "hello"); // prints the hash code of the value
        System.out.printf("%a", 10.25); // hexadecimal floating point values
        System.out.printf("%n"); // newline or line break ----- same as /n

    }
}
