import java.util.*;
class Number_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        task(n,'A','C','B');
    }
    static void task(int n , char a , char b , char c)
    {
        if(n==0)
        {
            return;
        }
        task(n-1,a,c,b);
        System.out.println(n+" is moved from rod "+a+" to rod "+b);
        task(n-1,c,b,a);
    }
}