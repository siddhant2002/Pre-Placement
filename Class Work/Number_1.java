import java.util.*;
class Number_1{

     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         task(String.valueOf(n));
     }
     static void task(String s)
     {
         int l=s.length();
         String a[] = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"};
         String b[] = {"Ten" , "Twenty" , "Thirty" , "Forty" , "Fifty" , "Sixty" , "Seventy" , "Eighty" , "Ninety"};
         String c[] = {"Eleven" , "Twelve" , "Thirteen" , "Fourteen" , "Fifteen" , "Sixteen" , "Seventeen" , "Eighteen" , "Nineteen"};
         int i=0;
         while(l!=0)
         {
             int m=Integer.parseInt(String.valueOf(s.charAt(i)));
             if(l==4)
             {
                 System.out.print(a[m]+" thousand ");
             }
             else if(l==3)
             {
                 if(m==0)
                 {
                     i++;
                     l--;
                     continue;
                 }
                 else
                 {
                     System.out.print(a[m]+" hundred ");
                 }
             }
             else if(l==2)
             {
                 if(m==0)
                 {
                     i++;
                     l--;
                     continue;
                 }
                 else if(s.charAt(i+1)=='0'&&m==1)
                 {
                     System.out.print("ten");
                     return;
                 }
                 else if(m==1)
                 {
                     int v=Integer.parseInt(String.valueOf(s.charAt(i+1)));
                     System.out.println(c[v-1]+" ");
                     return;
                 }
                 else
                 {
                     System.out.print(b[m-1]+" ");
                 }
             }
             else if(l==1)
             {
                 if(m==0)
                 {
                     i++;
                     l--;
                     continue;
                 }
                 System.out.println(a[m]);
             }
             i++;
             l--;
         }
     }
}