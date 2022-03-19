public class Number_6{

    public static void main(String []args){
       int n=15,n1=n+1;
       int k=(int)(Math.sqrt(n1));
       if(k*k == n1)
       {
           System.out.println("Sunny number");
       }
       else
       {
           System.out.println("Not sunny number");
       }
    }
}