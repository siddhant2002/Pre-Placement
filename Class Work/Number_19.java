import java.util.*;
class Number_19 {
    public static void main(String[] args) {
        int h[] = {1,1};
        int i,j=0,k=h.length-1;
        for(i=0;i<k;)
        {
            j=Math.max(j,Math.min(h[i],h[k])*(k-i));
            if(h[i]<h[k])
                i++;
            else
                k--;
        }
        System.out.println(j);
    }
}