import java.text.DecimalFormat;
import java.util.Scanner;

public class ABCServiceMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		Queue<Integer> queue = new Queue<Integer>();
		Queue<Integer> queue1 = new Queue<Integer>();
		Queue<Integer> queue2 = new Queue<Integer>();
		
		int n = sc.nextInt();
		for (int i=1; i<=n; i++){
			
			int customer = sc.nextInt();
			
			if(customer !=0){
			
			int [] minute = new int[customer];
			for (int j=0; j<customer; j++){
				minute[j] = sc.nextInt();
			}
			
			int limit = 0;
			for (int j=0; j<customer; j++){
				limit += minute[j];
				if (limit<=240){
					queue.enqueue(limit);
					queue1.enqueue(limit);
				}
			}
			int served = queue.size(); // determine how many people get the service
			
			if(queue.size()>0){
				
				int time = 0;
				for (int j=0; j<served; j++){
					if(j==0){
						time += queue.dequeue();
					}
					else {
						time += 13;
						int check = queue.dequeue();
						if(check>time){
							time = check;
						}
					}
					queue2.enqueue(time);
				}
				//System.out.println(queue1);
				//System.out.println(queue2);
				
				int [] wait = new int [served];
				for(int j=0; j<served; j++){
					wait[j] = queue2.dequeue()-queue1.dequeue();
					//System.out.print(wait[j]+" ");
				}
				
				int max = 0;
				for(int j=0; j<served; j++){
					if(wait[j]>max){
						max = wait[j];
					}
				}
				
				double total = 0;
				for(int j=0; j<served; j++){
					total += wait[j];
				}
				double average = total/served;
				
				System.out.println("Case #"+i+": "+served+" "+max+" "+df.format(average));
			}
			
			else{
				System.out.println("Case #"+i+": 0 0 0.00");
			}
			
			}
			
			else{
				System.out.println("Case #"+i+": 0 0 0.00");
			}
			
		}
		
		/*
		 3
		 22 14 10 15 12 11 14 11 12 13 10 13 10 14 10 13 10 10 10 14 13 13 10
		 16 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20 20
		 2 0 10
		 */
		
		sc.close();
		
	}

}
