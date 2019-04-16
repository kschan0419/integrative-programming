import java.util.Scanner;
import java.util.Stack;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		while(!str.equals("#")){
			
			if(!str.equals("-")) {
				stack.push(str);
			}
			else {
				System.out.println(stack.pop());
			}
			
			str = sc.next();
		}
		System.out.println(stack.size());
	
		sc.close();
	}

}
