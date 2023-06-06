/**
Write a program which reads from the user three non-negative integers and then
prints, using symbols ’*’, a ‘histogram’ of the data represented by the numbers, i.e.,
three vertical bars, aligned at the bottom, with heights equal to the values of the
three numbers.
For example, for numbers 3, 1 and 8 the result should look like this:
*
*
*
*
*
* *
* *
***
Do not use arrays, strings or any other kind of collections
**//
import java.util.Scanner;
 
public class KLIMENKO
    { 
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First non-negative number: ");
        Integer num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Second non-negative number: ");
        Integer num2 = Integer.valueOf(scan.nextLine());
        System.out.println("Third non-negative number: ");
        Integer num3 = Integer.valueOf(scan.nextLine());

        int max = Math.max(Math.max(num1, num2), num3);
        
        for (int i = max; i>=1; i--){
            if (i<=num1){
                System.out.print("*");;
            } else {
                System.out.print(" ");
            }

            if (i<=num2){
                System.out.print("*");;
            } else {
                System.out.print(" ");
            }

            if (i<=num3){
                System.out.print("*");;
            } else {
                System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
        
// I wrote cod without string and don't forget to close the scanner
    }
}
