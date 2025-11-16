import java.util.*;
public class Second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            ArrayList<Integer> even=new ArrayList<>();
            ArrayList<Integer> odd=new ArrayList<>();
            boolean brake=false;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0) even.add(a[i]);
                else odd.add(a[i]);
            }

            if(a[0]==1){
                brake=true;
                System.out.println(a[0]+" "+a[1]);
            }
            else if(even.size()>=2){
                brake=true;
                System.out.println(even.get(0)+" "+even.get(1));
            }
            else{
                for(int i=0;i<n && !brake;i++){
                    for(int j=i+1;j<n;j++){
                        if( ((a[j] % a[i]) % 2) == 0 ){
                            System.out.println(a[i]+" "+a[j]);
                            brake=true;
                            break;
                        }
                    }
                }
            }

            if(!brake)
                System.out.println(-1);
        }
    }
}
