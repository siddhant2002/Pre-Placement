public class Number_2{

    public static void main(String []args){
       int n=145,d=n,s=0;
       while(d!=0)
       {
           s=s+(fact(d%10));
           d/=10;
       }
       if(s==n)
       {
           System.out.println("Peterson number");
       }
    }
    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
}
