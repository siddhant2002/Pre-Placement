public class Number_7{

    public static void main(String []args){
       int n=12;
       StringBuilder nm=new StringBuilder();
       while(n!=0)
       {
           nm.insert(0,n%2);
           n/=2;
       }
       System.out.println(nm);
       int k=nm.length();
       int c=0;
       for(int i=0;i<k;i++)
       {
           if(nm.charAt(i)=='1')
           {
               c++;
           }
       }
       if(c%2==0)
       {
           System.out.println("Evil number");
       }
       else
       {
           System.out.println("Not evil number");
       }
    }
    
}