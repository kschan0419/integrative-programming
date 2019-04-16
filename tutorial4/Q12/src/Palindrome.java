import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new Queue<Character>();

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		while(!str.equals("#")){
		for(int i=0; i<str.length(); i++){
			stack.push(str.charAt(i));
			queue.enqueue(str.charAt(i));
		}	
		
		int check = 0;
		
		while(!stack.isEmpty() && !queue.isEmpty()){
			if(stack.pop()!=queue.dequeue()){
				check ++;
			}
		}
		
		if(check!=0){
			System.out.println(false);
		}
		else{
			System.out.println(true);
		}
		
			
		str = sc.next();
		}
		
		sc.close();
	}

}
