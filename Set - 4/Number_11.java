import java.util.*;
class Number_11{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        task(a,b,c,d);
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
        {
            return b;
        }
        return gcd(b%a, a);
    }
    static void task1(int a , int b)
    {
        int k=gcd(a,b);
        a=a/k;
        b=b/k;
        System.out.println(a+"/"+b);
    }
    static void task(int a , int b , int c , int d)
    {
        int k=gcd(b,d);
        k=(b*d)/k;
        int n=a*(k/b)+c*(k/d);
        task1(n,k);
    }
}