public class Number_5{

    public static void main(String []args){
       int n=193,n1=n*2,n2=n*3;
       int c[] = new int[10];
       while(n!=0)
       {
           c[n%10]++;
           n/=10;
       }
       while(n1!=0)
       {
           c[n1%10]++;
           n1/=10;
       }
       while(n2!=0)
       {
           c[n2%10]++;
           n2/=10;
       }
       for(int i=1;i<=9;i++)
       {
           if(c[i]!=1)
           {
               System.out.println("Not Fascinating number");
               return;
           }
       }
       System.out.println("Fascinating number");
    }
}