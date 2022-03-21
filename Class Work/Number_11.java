import java.util.*;

public class Number_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers before Swapping: "+"a = "+a+" and b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after Swapping: "+"a = "+a+" and b = "+b);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Numbers before Swapping: "+"m = "+m+" and n = "+n);
        n=m^n;
        m=m^n;
        n=m^n;
        System.out.println("Numbers after Swapping: "+"m = "+m+" and n = "+n);
    }
}