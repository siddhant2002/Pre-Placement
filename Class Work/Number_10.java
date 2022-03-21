import java.util.*;
class Main{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println(gcd(3,5));
         System.out.println(gcd1(13,67));
     }
     static int gcd(int a , int b) 
     {
        if(a==0)
        {
            return b;
        }
        else if(b==0)
        {
            return a;
        }
        while(a!=b) 
        {
            if (a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        return a;
     }
     static int gcd1(int a , int b)
     {
         if(b==0)
         {
             return a;
         }
         return gcd1(b,a%b);
     }
}