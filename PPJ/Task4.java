import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("qazjmkifvds");
        String str = scan.nextLine();
        int a = 23, r = 121, g = 255, b = 130, color = 0;
        color = (a << 24) | (r << 16) | (g << 8) | b;
        System.out.println("a, r, g, b = " + a + ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color); 
        a = r = g = b = 0;
        
        a = (color >> 24) & 0xff;
        r = (color >> 16) & 0xff;
        g = (color >> 8) & 0xff;
        b = color & 0xff;
        
        System.out.println("a, r, g, b = " + a +", " + r + ", " + g + ", " + b);

    }
}
