import java.util.*;
class HelloWorld{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         int j=0,c=1;
         for(int i=1;i<n;i++)
         {
             if(a[i]==a[j])
             {
                 c++;
             }
             else
             {
                 c--;
             }
             if(c==0)
             {
                 j=i;
                 c=1;
             }
         }
         System.out.println(j+" "+c);
         int f=0;
         for(int i=0;i<n;i++)
         {
             if(a[j]==a[i])
             {
                 f++;
             }
         }
         if(f>n/2)
         {
             System.out.println(a[j]+" found");
         }
         else
         {
             System.out.println("Not found");
         }
     }
}
