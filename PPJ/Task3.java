

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int a1 = 2;
                int a2 = 4;
                int b1 = 1;
                int b2 = 6;
                System.out.println("Interval A = [" + a1 + ", " + a2 + "]");
                System.out.println("Interval B = [" + b1 + ", " + b2 + "]");

                System.out.println("Enter x: ");
                int x = scan.nextInt();
                scan.close();

                boolean xInA = (x >= a1 && x <= a2);
                boolean xInB = (x >= b1 && x <= b2);
                boolean aNotB = xInA && !xInB;
                boolean bNotA = xInB && !xInA;
                boolean intersec = xInA && xInB;
                boolean union = xInA || xInB;
                boolean symetric = aNotB || bNotA;


                System.out.printf("%-30s %-10s\n", "x in A: ", xInA);
                System.out.printf("%-30s %-10s\n", "x in B: ", xInB);
                System.out.printf("%-30s %-10s\n", "x in A\\B: ", aNotB);
                System.out.printf("%-30s %-10s\n", "x in B\\A: ", bNotA);
                System.out.printf("%-30s %-10s\n", "x in intersection of A and B: ", intersec);
                System.out.printf("%-30s %-10s\n", "x in union of A and B: ", union);
                System.out.printf("%-30s %-10s\n", "x in symm. diff. of A and B: ", symetric);

        }
}
