import java.util.*;
public class Number_13
{
    public static void main(String args[])
    {
        int a=999;
        int b=999;
        int c=0;
        String m=String.valueOf(a);
        String n=String.valueOf(b);
        int i=m.length()-1,j=n.length()-1;
        String p="";
        for(;i>=0&&j>=0;i--,j--)
        {
            int g=Integer.parseInt(String.valueOf(m.charAt(i)));
            int h=Integer.parseInt(String.valueOf(n.charAt(j)));
            int k=g+h+c;
            if(k>=10)
            {
                k-=10;
                p=String.valueOf(k)+p;
                c=1;
            }
            else
            {
                p=String.valueOf(k)+p;
                c=0;
            }
        }
        if(j<0)
        {
            while(i>=0)
            {
                int g=Integer.parseInt(String.valueOf(m.charAt(i)));
                int k=g+c;
                if(k>=10)
                {
                    k-=10;
                    p=String.valueOf(k)+p;
                    c=1;
                }
                else
                {
                    p=String.valueOf(k)+p;
                    c=0;
                }
                i--;
            }
            if(c==1)
            {
                System.out.println(c+p);
            }
            else
            {
                System.out.println(p);
            }
        }
        else
        {
            while(j>=0)
            {
                int g=Integer.parseInt(String.valueOf(n.charAt(j)));
                int k=g+c;
                if(k>=10)
                {
                    k-=10;
                    p=String.valueOf(k)+p;
                    c=1;
                }
                else
                {
                    p=String.valueOf(k)+p;
                    c=0;
                }
                j--;
            }
            if(c==1)
            {
                System.out.println(c+p);
            }
            else
            {
                System.out.println(p);
            }
        }
    }
}
