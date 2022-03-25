class Number_22 {
    public static void main(String[] args) {
        int n[] = {2,0,1,1,1,2,0,0,2,1};
        int i=0,m=0,j=n.length-1;
        while(m<=j)
        {
            if(n[m]==0)
            {
                int k=n[i];
                n[i]=n[m];
                n[m]=k;
                m++;
                i++;
            }
            else if(n[m]==1)
            {
                m++; 
            }
            else
            {
                int k=n[j];
                n[j]=n[m];
                n[m]=k;
                j--;
            }
        }
        for(int p:n)
        {
            System.out.print(p+" ");
        }
    }
}