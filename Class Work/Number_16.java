import java.util.*;
class Number_16 {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,3,4,2,3,6,2,7,6,4};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int j;
            for(j=i+1;j<n;j++)
            {
                if(a[j]==a[i])
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println(a[n-1]);
    }
}