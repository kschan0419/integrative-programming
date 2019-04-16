import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int i=0; i<N; i++){
			
			String string = sc.nextLine();
			
			Stack<String> stack  = new Stack<String>();
			Queue<String> queue = new Queue<String>();
			
			Scanner input = new Scanner(string);
        	
			while(input.hasNext()) {
				
				String str = input.next();	
				
				if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") && !str.equals("(") && !str.equals(")")){
					queue.enqueue(str);
				}
				
				if(str.equals("+") || str.equals("-")){
					if(queue.size()<2){
						if(stack.isEmpty()){
							stack.push(str);
						}
						//else if (!stack.isEmpty() && stack.peek().equals('(')){
						//	stack.push(str);
						//}
						else{
							//while(!queue.isEmpty()){
							//	System.out.print(queue.dequeue()+" ");
							//}
							//while(!stack.isEmpty() && !stack.peek().equals("(")){
							//	System.out.print(stack.pop()+" ");
							//}
							//stack.push(str);
							if(stack.peek().equals("+") || stack.peek().equals("-") || stack.peek().equals("*") || stack.peek().equals("/")){
								while(!queue.isEmpty()){
									System.out.print(queue.dequeue()+" ");
								}
								while(!stack.isEmpty() && !stack.peek().equals("(")){
									System.out.print(stack.pop()+" ");
								}
								stack.push(str);
							}
							else if (stack.peek().equals("(")){
								stack.push(str);
							}
							
						}
					}
					else{
						if(stack.peek().equals("+") || stack.peek().equals("-") || stack.peek().equals("*") || stack.peek().equals("/")){
							while(!queue.isEmpty()){
								System.out.print(queue.dequeue()+" ");
							}
							while(!stack.isEmpty() && !stack.peek().equals("(")){
								System.out.print(stack.pop()+" ");
							}
							stack.push(str);
						}
						else if (stack.peek().equals("(")){
							stack.push(str);
						}
					}
				}
				
				else if(str.equals("*") || str.equals("/")){
					if(queue.size()<2){
						if(stack.isEmpty()){
							stack.push(str);
						}
						//else if (!stack.isEmpty() && stack.peek().equals('(')){
						//	stack.push(str);
						//}
						else{
							//while(!queue.isEmpty()){
							//	System.out.print(queue.dequeue()+" ");
							//}
							//while(!stack.isEmpty() && !stack.peek().equals("(")){
							//	System.out.print(stack.pop()+" ");
							//}
							if(stack.peek().equals("*") || stack.peek().equals("/")){
								while(!queue.isEmpty()){
									System.out.print(queue.dequeue()+" ");
								}
								while(!stack.isEmpty() && !stack.peek().equals("(")){
									System.out.print(stack.pop()+" ");
								}
								stack.push(str);
							}
							else if (stack.peek().equals("(") || stack.peek().equals("+") || stack.peek().equals("-")){
								stack.push(str);
							}
							//
							//stack.push(str);
						}
					}
					else{
						if(stack.peek().equals("*") || stack.peek().equals("/")){
							while(!queue.isEmpty()){
								System.out.print(queue.dequeue()+" ");
							}
							while(!stack.isEmpty() && !stack.peek().equals("(")){
								System.out.print(stack.pop()+" ");
							}
							stack.push(str);
						}
						else if (stack.peek().equals("(") || stack.peek().equals("+") || stack.peek().equals("-")){
							stack.push(str);
						}
					}
				}
				
				else if(str.equals("(")){
					stack.push(str);
				}
				
				else if(str.equals(")")){
					while(!queue.isEmpty()){
						System.out.print(queue.dequeue()+" ");
					}
					while(!stack.peek().equals("(")){
						System.out.print(stack.pop()+" ");
					}
					stack.pop();
				}
				
        	}
			
			while (!queue.isEmpty()){
				System.out.print(queue.dequeue()+" ");
			}
			while(!stack.isEmpty()){
				if(!stack.peek().equals("(")){
					System.out.print(stack.pop()+" ");
				}
				else{ 
					stack.pop();
				}
			}
			
			System.out.println();
			input.close();
			
		}
		
		/*
		 5 
		 3 + 4
		 3 + 4 * 5
		 3 * ( 4 + 5 )
		 12 + 60 / 23
		 ( 3 + 7 ) * ( 8 - 5 )
		 ( 1 + 2 ) + ( 3 + 4 ) / ( 12 - 5 )
		 1 + 2 - 3 + 4 - 5 + 6 * 7 + 8 * 9 - 10 * 11 / 12 * 13
		 */
		
		sc.close();
		
	}

}
