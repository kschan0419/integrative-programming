import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new Queue<String>();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		while(!str.equals("#")){
			
			if(!str.equals("-")) {
				queue.enqueue(str);
			}
			else {
				System.out.println(queue.dequeue());
			}
			
			str = sc.next();
		}
		System.out.println(queue.size());
	
		sc.close();
		
	}

}
