import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            HashMap<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<2*n;i++){
                int a=sc.nextInt();
                m.put(a,m.getOrDefault(a,0)+1);
            }
            PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
            for(Map.Entry<Integer,Integer> x:m.entrySet()){
                pq.add(x);
            }
            int res=0,l=n,r=n,x=0;
            while(!pq.isEmpty()){
                int val=pq.poll().getValue();
                int p1=0,p2=0;
                if(val % 2 == 1){
                    p1 = 1;
                    p2 = val - 1;
                } 
                else {
                    if(l > 0 && r > 0){
                        p1 = 1;
                        p2 = val - 1;
                    } else {
                        p1 = Math.min(val, l);
                        p2 = val - p1;
                    }
                }

                //System.out.println("half:"+half+" p1:"+p1+" p2:"+p2+" l:"+l+" r:"+r+"res:"+res);
                if(p1==p2){
                    if(p1>l||p2>r){
                        int minus1=Math.min(p1,l);
                        int minus2=Math.min(p2,r);
                        res+=l%2;
                        res+=r%2;
                        l-=minus1;
                        r-=minus2;
                    }
                    else{
                        res+=p1%2+p2%2;
                        l-=p1;
                        r-=p2;
                    }
                }
                else{
                    if(x==0){
                        if(p1>l||p2>r){
                            int minus1=Math.min(p1,l);
                            int minus2=Math.min(p2,r);
                            res+=l%2;
                            res+=r%2;
                            l-=minus1;
                            r-=minus2;
                        }
                        else{
                            res+=p1%2+p2%2;
                            l-=p1;
                            r-=p2;
                        }
                    }
                    else{
                        if(p1>r||p2>l){
                            int minus1=Math.min(p1,r);
                            int minus2=Math.min(p2,l);
                            res+=l%2;
                            res+=r%2;
                            r-=minus1;
                            l-=minus2;
                        }
                        else{
                            res+=p1%2+p2%2;
                            r-=p1;
                            l-=p2;
                        }
                    }
                    x^=1;
                }
                //System.out.println("half:"+half+" p1:"+p1+" p2:"+p2+" l:"+l+" r:"+r+"res:"+res);
            }
            System.out.println(res);
        }
    }
}
