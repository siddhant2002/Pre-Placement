import java.util.*;
class Number_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        Arrays.sort(a);
        for(String i:a)
        {
            System.out.println(i);
        }
    }
}