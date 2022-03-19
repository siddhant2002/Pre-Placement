public class Number_4{

    public static void main(String []args){
       int n=2025;
       int c=0,d=n;
       while(d!=0)
       {
           c++;
           d/=10;
       }
       int a=n/(int)(Math.pow(10,c/2));
       int b=n%(int)(Math.pow(10,c/2));
       a+=b;
       a*=a;
       if(a==n)
       {
           System.out.println("Tech number");
       }
       else
       {
           System.out.println("Not tech number");
       }
    }
}