import java.text.DecimalFormat;
import java.util.Scanner;

public class newABCServiceMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int cases = sc.nextInt();
		for(int i=1; i<=cases; i++){
			
			Queue <Integer> queue1 = new Queue <Integer>();
			Queue <Integer> queue2 = new Queue <Integer>();
			
			int customers = sc.nextInt();
			for(int j=1; j<=customers; j++){
				int time1 = sc.nextInt();
				queue1.enqueue(time1);
			}
			
			//System.out.println(queue1);
			
			int limit = 240;
			int time3 = 0;
			int count = 0;
			int check = queue1.peek();
			int time4 = 0;
			
			//for(int x=0; x<customers; x++){
			while(!queue1.isEmpty() && check<=240){
				count++;
				if(count == 1){
					time3 = queue1.dequeue();
					queue2.enqueue(0);
				}
				else {
					if((queue1.peek()+time3)<=time3+13+time4){
						queue2.enqueue(time3+13+time4-queue1.peek()-time3);
						time4 += time3+13-queue1.peek()-time3;
						queue1.dequeue();
						time3 += 13;
					}
					else{
						queue2.enqueue(0);
						//time3 = queue1.peek()+time3+(queue1.peek()+time3)-(time3+13+time4);
						time3 = time3 + 13 + ((queue1.peek()+time3)-(time3+13+time4));
						time4=0;
						queue1.dequeue();
					}
				}
				if(!queue1.isEmpty()) check += queue1.peek();
				else check = 241;
			}
			//}
			
			int max = 0;
			for(int k=1; k<=queue2.size(); k++){
				if(queue2.peek()>=max){
					max = queue2.dequeue();
					queue2.enqueue(max);
				}
				else{
					queue2.enqueue(queue2.dequeue());
				}
			}
			
			//System.out.println(queue2);
			
			double avg = 0;
			double total = 0.00;
			if(!queue2.isEmpty()){
			while(!queue2.isEmpty()){
				total += queue2.dequeue();
			}
			avg = total/count;
			}
			
			System.out.println("Case #"+i+": "+count+" "+max+" "+df.format(avg));
			
		}
		
	}

}
