import java.util.*;
class Number_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a != b ? (a * (a/b > 0 ? 1 : 0))+(b * (b/a > 0 ? 1 : 0)) : a;
        System.out.println(c);
    }
}