import java.util.*;
class Number_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double f=0.00001;
        System.out.println(sqrt(n,f));
    }
    static double sqrt(double n , double f)
    {
        double a=n,b;
        while(true)
        {
            b=0.5*(a+(n/a));
            System.out.println(b);
            if(Math.abs(b-a)<f)
            {
                break;
            }
            a=b;
            System.out.println(a);
        }
        return b;
    }
}