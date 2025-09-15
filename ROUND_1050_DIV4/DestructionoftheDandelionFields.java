import java.util.*;

public class DestructionoftheDandelionFields {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            List<Long> odd=new ArrayList<>();
            List<Long> even=new ArrayList<>();
            for(int i=0;i<n;i++){
                long a=sc.nextLong();
                if(a%2==0) even.add(a);
                else odd.add(a);
            }
            if(odd.size()==0) System.out.println(0);
            else{
                Collections.sort(odd);
                int r=odd.size()-1,l=0;
                long sum=0;
                sum+=odd.get(r);
                r--;
                for(long i:even) sum+=i;
                while(r-l>=1){
                    l++;
                    sum+=odd.get(r);
                    r--;
                }
                System.out.println(sum);
            }
        }
    }
}
