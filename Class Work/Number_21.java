class Number_21 {
    public static void main(String[] args) {
        int n=40,flag=1;
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                if(flag == 1)
                {
                    System.out.print(i+" ");
                    flag=0;
                }
                else
                {
                    flag=1;
                }
            }
        }
    }
    static boolean isprime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}