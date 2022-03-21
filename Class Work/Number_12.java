import java.util.*;
class Number_12{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int a[]={1,2,3,4,5,6,7};
         int k=3,n=7;
         k%=a.length;
         int b[]=new int[k];
         for(int i=0;i<k;i++)
         {
             b[i]=a[i];
         }
         for(int i=k;i<n;i++)
         {
             a[i-k]=a[i];
         }
         for(int i=n-k,j=0;i<n;i++,j++)
         {
             a[i]=b[j];
         }
         for(int i:a)
         {
             System.out.print(i+" ");
         }
     }
}
