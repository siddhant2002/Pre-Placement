import java.util.*;
class Number_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> nm=new HashMap<>();
        while(true)
        {
            int n=sc.nextInt();
            if(n==0)
            {
                break;
            }
            else
            {
                nm.put(n , nm.getOrDefault(n,0)+1);
            }
        }
        System.out.println(nm);
        List<Map.Entry<Integer,Integer>> kk=new LinkedList<Map.Entry<Integer,Integer>>(nm.entrySet());
        Collections.sort(kk , new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a , Map.Entry<Integer,Integer> b)
            {
                return a.getKey() - b.getKey();
            }
        });
        for(Map.Entry<Integer,Integer> k:kk)
        {
            if(k.getValue()==1)
            {
                System.out.println(k.getKey()+" occurs 1 time");
            }
            else
            {
                System.out.println(k.getKey()+" occurs "+k.getValue()+" times");
            }
        }
    }
}