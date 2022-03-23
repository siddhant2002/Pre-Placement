import java.util.*;
public class Number_14
{
    public static void main(String args[])
    {
        int a[]={4,5,6,0,0,0};
        int m=3;
        int b[]={1,2,3};
        int n=3;
        int i=m-1,j=n-1,f=m+n-1;
        while(j>=0)
        {
            if(i>=0 && a[i]>b[j])
            {
                a[f--] = a[i--];
            }
            else
            {
                a[f--]=b[j--];
            }
        }
        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }
}
