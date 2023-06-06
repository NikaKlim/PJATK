/** 
Write a program reading integers until zero is entered and printing the length of the
longest sequence of consecutive numbers of the same value (and this value).
For example, for
2 2 2 2 3 3 3 2 6 6 6 0
the result should be
Longest sequence: 4 times 2
for
2 2 2 3 3 3 3 3 2 6 6 6 0
the result should be
Longest sequence: 5 times 3
and for
2 2 333 333 2 3 -66 -66 -66 0
it should be
Longest sequence: 3 times -66
Do not use arrays, strings or any other kind of collections.
Check your solutions for different cases: when the longest sequence is at the beginning,
somewhere in the middle, or at the very end.
**/
import java.util.Scanner;
 
public class KLIMENKO
    { 
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int count = 0;
        int maxCount = 0;
        int maxValue = 0;

        while (true){
           int n = scan.nextInt();

            if (n==0) break;
            
            if (n==value){
                count ++;
            } else {
                if (count>maxCount){
                    maxCount=count;
                    maxValue = value;
                }else{
                    value = n;
                    count = 1;
                }
            }
        }
        if (count>maxCount){
            maxCount=count;
            maxValue = value;
        }
        System.out.println("Longest sequence: " + maxCount + " times " + maxValue);
    }
}
