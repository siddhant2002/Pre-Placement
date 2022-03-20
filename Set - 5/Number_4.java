import java.util.*;
class Number_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<Integer,Integer> nm=new LinkedHashMap<>();
        for(int i=0;i<10;i++)
        {
            int n=sc.nextInt();
            nm.put(n , nm.getOrDefault(n,0)+1);
        }
        for(int k:nm.keySet())
        {
            System.out.println(k);
        }
    }
}