import java.util.*;
public class Bachao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            int closestLeft = -1, closestRight = -1;

            for(int j = 0; j < x; j ++){
                if(s.charAt(j) == '#'){
                    closestLeft = j+1;
                }
            }
            for(int j = x; j < n; j ++){
                if(s.charAt(j) == '#'){
                    if (closestRight == -1){
                        closestRight = n-j;
                    }
                }
            }
            int answer;
            if(closestRight == -1 && closestLeft == -1){
                answer = 1;
            }
            else if(x == 1 || x == n){
                answer = 1;
            }
            else {
                answer = Math.min(Math.min(x-1,n-x),Math.max(closestLeft, closestRight))+1;
            }

            System.out.println(answer);
        }

    }
}
