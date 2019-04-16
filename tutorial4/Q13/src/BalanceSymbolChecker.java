import java.util.Scanner;
import java.util.Stack;

public class BalanceSymbolChecker {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        while(!str.equals("#")){
        	
        	Stack<Character> stack  = new Stack<Character>();
        	
        	boolean check = false;
        	for(int i = 0; i < str.length(); i++) {
        		char c = str.charAt(i);
        		
            if(c == '[' || c == '(' || c == '{' ) {
                stack.push(c);
            }
            else if(c == ']') {
            	if(stack.isEmpty()) {check = false; stack.push(']');}
            	else{
            		if(stack.peek() != '[') {check = false; stack.push(']');}
            		else {check = true; stack.pop();}
            	}
            }
            else if(c == ')') {
            	if(stack.isEmpty()) {check = false; stack.push(')');}
            	else{
            		if(stack.peek() != '(') {check = false; stack.push(')');}
               	    else {check = true; stack.pop();}
            	}
            }
            else if(c == '}') {
            	if(stack.isEmpty()) {check = false; stack.push('}');} 
            	else{
            		if(stack.peek() != '{') {check = false; stack.push('}');}    	
            		else {check = true; stack.pop();}
            	}
            }
            
        	}
        	if(!stack.isEmpty()) check = false;
        	System.out.println(check);
        	
        	str = sc.nextLine();
        }      
        
        sc.close();
    }
}