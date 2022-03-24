import java.util.*;
public class CheckTheRemainderAfterDivision {
    public static void main(String[] args){
        int a,b,i;
        Scanner readLine = new Scanner(System.in);
        System.out.println("Enter the two numbers:: ");
        a = readLine.nextInt();
        b = readLine.nextInt();

        System.out.println(a%b);
    }

}
