import java.util.*;
class Number_20 {
    public static void main(String[] args) {
        int n[] = {-2,-1,0,2,1,-1,-2,0,-3,1,1,2,2,-1};
        List<List<Integer>> nm=new ArrayList<List<Integer>>();
        Arrays.sort(n);
        int k=n.length;
        for(int i=0;i<k-2;i++)
        {
            if(i==0||(i>0&&n[i]!=n[i-1]))
            {
                int l=i+1,h=k-1,s=-n[i];
                while(l<h)
                {
                    if((n[l]+n[h])==s)
                    {
                        nm.add(Arrays.asList(n[i],n[l],n[h]));
                        while(l<h&&n[l]==n[l+1])
                        {
                            l++;
                        }
                        while(l<h&&n[h]==n[h-1])
                        {
                            h--;
                        }
                        l++;
                        h--;
                    }
                    else if(n[l]+n[h]<s)
                    {
                        l++;
                    }
                    else
                    {
                        h--;
                    }
                }
            }
        }
        System.out.println(nm);
    }
}