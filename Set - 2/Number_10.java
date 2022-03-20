import java.util.*;
class Number_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=Integer.MIN_VALUE,q=Integer.MIN_VALUE,r=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]>p)
            {
                r=q;
                q=p;
                p=a[i];
            }
            else if(a[i]>q&&a[i]!=p)
            {
                r=q;
                q=a[i];
            }
            else if(a[i]>r&&a[i]!=q)
            {
                r=a[i];
            }
        }
        if(r==Integer.MIN_VALUE)
        {
            System.out.println("3rd largest number doesn't exist");
        }
        else
        {
            System.out.println("The 3rd largest number is "+r);
        }
    }
}