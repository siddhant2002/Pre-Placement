public class Number_3{

    public static void main(String []args){
       int n=5;
       for(int i=1;i<=n;i++)
       {
           for(int k=1;k<=i;k++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=1;i<=n;i++)
       {
           for(int b=1;b<=n-i;b++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=1;i<=n;i++)
       {
           for(int b=1;b<=n-i;b++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
       System.out.println();
       for(int i=n;i>=1;i--)
       {
           for(int b=1;b<=n-i;b++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}