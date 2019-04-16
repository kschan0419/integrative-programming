import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> oddQueue = new Queue<Integer>();
		Queue<Integer> evenQueue = new Queue<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//int i = 0;
		while(input!=0){
			
			if(input%2==0) {
				evenQueue.enqueue(input);
			}
			else {
				oddQueue.enqueue(input);
			}
			
			//i++;
			input = sc.nextInt();
		}
		
		System.out.println("oddQueue "+oddQueue.size()+":"+oddQueue);
		System.out.println("evenQueue "+evenQueue.size()+":"+evenQueue);
		
		sc.close();
	}

}
