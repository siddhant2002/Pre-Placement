import java.util.*;
class Number_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    String k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
        }
        for(String k:a)
        {
            System.out.println(k);
        }
    }
}