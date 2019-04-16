import java.util.*;
import java.io.*;

public class Monk {
	static int[] arr;
	
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
			
		int N = sc.nextInt();	
		int X = sc.nextInt();	
		
		while(N!=0&&X!=0){
			
		int[] arr = new int[N];
		Queue<Spider> q1 = new LinkedList<Spider>();
		Queue<Spider> q2 = new LinkedList<Spider>();
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			q1.add(new Spider(arr[i], i));
		}
		
		for (int i = 0; i < X; i++) {
			int size = q1.size();
			int max = Integer.MIN_VALUE;
			int s = Math.min(size, X);
			int index = -1;
			int position = 0;
			for (int j = 0; j < s; j++) {
				Spider n = q1.remove();
				if (n.val > max) {
					max = n.val;
					index = n.index;
					position = j;
				}			
				q2.add(n);
			}			
			System.out.print(index+1 + " ");
			int len = q2.size();
			for (int k = 0; k < len; k++) {
				Spider n = q2.remove();				
				if (k == position) continue;				
				if (n.val != 0) n.val--;
				q1.add(n);
			}
			
		}
		System.out.println();
		N = sc.nextInt();	
		X = sc.nextInt();	
	}
	}
		
	static class Spider {
		int val;
		int index;
		Spider(int v, int i) {
			val = v;
			index = i;
		}	
	}
}
