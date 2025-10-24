import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            char c[]=sc.next().toCharArray();
            List<String> l=new ArrayList<>();
            int val=0,div=1,op=0;
            for(char ch:c){
                if(ch=='A'){
                    if(div!=1){
                        l.add("div"+op+"|"+div);
                        div=1;
                        op=0;
                    }
                        op++;
                        val++;
                }
                else{
                    if(val!=0){
                        l.add("min"+op+"|"+val);
                        val=0;
                        op=0;
                    }
                        op++;
                        div*=2;
                }
            }
            if(val!=0) l.add("min"+op+"|"+val);
            if(div!=1) l.add("div"+op+"|"+div);
            //System.out.println(l);
            while (q-->0) {
                long a=sc.nextLong();
                long ans=0;
                if(l.size()==1){
                    if(l.get(0).startsWith("min")){
                        ans=a;
                    }
                    else{
                        while(a>0){
                            ans++;
                            a/=2;
                        }
                    }
                }
                else{
                    int s=l.size(),idx=0;
                    while (a>0) {
                        String x=l.get(idx);
                        if(x.startsWith("min")){
                            String arr[]=x.substring(3).split("\\|");
                            ans+=Integer.parseInt(arr[0]);
                            a-=Integer.parseInt(arr[1]);
                            if(a<0){
                                ans+=a;
                                break;
                            }
                        }
                        else{
                            String arr[]=x.substring(3).split("\\|");
                            int dv=Integer.parseInt(arr[1]);
                            if(a/dv==0){
                                while(a>0){
                                    ans++;
                                    a/=2;
                                }
                                break;
                            }
                            else{
                                ans+=Integer.parseInt(arr[0]);
                                a/=dv;
                            }
                        }
                        idx=(idx+1)%s;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}