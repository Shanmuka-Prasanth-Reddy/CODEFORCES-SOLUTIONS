import java.util.*;

public class Homework{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int m=sc.nextInt(),i=0;
            String p=sc.next();
            String moves=sc.next();
            Deque<Character> q=new ArrayDeque<>();
            for(char c:s.toCharArray()) q.add(c);
            for(char c:moves.toCharArray()){
                if(c=='D'){
                    q.add(p.charAt(i));
                }
                else{
                    q.addFirst(p.charAt(i));
                }
                i++;
            }
            while(!q.isEmpty()){
                System.out.print(q.removeFirst()+"");
            }
            System.out.println();
        }
    }
}