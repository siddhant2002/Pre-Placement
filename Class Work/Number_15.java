import java.util.*;
class Number_15 {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,3,4,2,3,6,2,7,6,4};
        int n=a.length;
        LinkedHashSet<Integer> nm=new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            nm.add(a[i]);
        }
        for(int i:nm)
        {
            System.out.print(i+" ");
        }
    }
}