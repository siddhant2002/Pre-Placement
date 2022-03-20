import java.util.*;
class Number_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int s=search(a,0,n-1,x);
        if(s!=-1)
        {
            System.out.println("Found at "+s+" index");
        }
        else
        {
            System.out.println("Not found");
        }
    }
    static int search(int a[] , int i , int j , int n)
    {
        if(i<=j&&i<a.length)
        {
            int m=i+(j-i)/2;
            if(a[m]==n)
            {
                return m;
            }
            else if(a[m]>n)
            {
                return search(a,i,m-1,n);
            }
            return search(a,m+1,j,n);
        }
        return -1;
    }
}