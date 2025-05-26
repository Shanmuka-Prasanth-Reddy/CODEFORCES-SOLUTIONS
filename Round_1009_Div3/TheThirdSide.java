import java.util.*;

public class TheThirdSide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int i=0;i<n;i++){
                pq.add(sc.nextInt());
            }
            while(pq.size()!=1){
                int a=pq.poll();
                int b=pq.poll();
                int c=a+b-1;
                pq.add(c);
            }
            System.out.println(pq.poll());
        }
    }
}
