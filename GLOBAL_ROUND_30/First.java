import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int x=sc.nextInt();
            Stack<Integer> st=new Stack<>();
            st.push(a[0]);
            String ans="YES";
            for(int i=1;i<n;i++){
                int v1=st.peek();
                int v2=a[i];
                if((v1<=x&&v2>=x) || (v1>=x && v2<=x)){
                    st.pop();
                    st.push(x);
                }
                else{
                    st.push(a[i]);
                }
            }
            //System.out.println(st);
            System.out.println(ans.equals("YES") && st.peek()==x?"YES":"NO");
        }
    }
}