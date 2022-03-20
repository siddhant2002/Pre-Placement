import java.util.*;
class Number_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(valid(s.toLowerCase()));
    }
    static String valid(String s)
    {
        int k=s.length();
        if(k<8)
        {
            return "Not Valid";
        }
        int p=0;
        for(int i=0;i<k;i++)
        {
            char c=s.charAt(i);
            if((c>='a'&&c<='z')||(c>='0'&&c<='9'))
            {
                if((c>='0'&&c<='9'))
                {
                    p++;
                }
            }
            else
            {
                return "Not Valid";
            }
        }
        return p>=2 ? "Valid" : "Not Valid";
    }
}
