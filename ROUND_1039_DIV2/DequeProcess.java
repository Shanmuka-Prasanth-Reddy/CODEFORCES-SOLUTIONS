import java.util.*;

public class DequeProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--> 0) {
			int N = sc.nextInt();	
			List<Integer> input = new ArrayList<>();
			for(int i = 0; i < N; i++) {
				int a = sc.nextInt();		
				input.add(a);
			}
			int mode = 0;
			for(int i = 0; i < N/2; i++) {
				if(mode == 0) {
				    if(input.get(i) > input.get(N - i - 1)){
				        System.out.print("RL");
				    }
				    else{
				        System.out.print("LR");
				    }
				}
				else {
				    if(input.get(i) > input.get(N - i - 1)){
				        System.out.print("LR");
				    }
				    else{
				        System.out.print("RL");
				    }				
				}
				mode = 1 - mode;
			}
			if(N%2 != 0) {
				System.out.print("R");
			}
			System.out.println();
		}
	}
}