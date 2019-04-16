import java.util.Scanner;
import java.util.Stack;

public class newBalanceHTMLTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        int N = Integer.parseInt(sc.nextLine());
        
        for(int n=0; n<N; n++){
        	String str = sc.nextLine();
        	checker(str);
        }
        
        // 2 
        // <p> you are the <i> semicolon </i> to <b> my </b> statement </p>
    	// <p> first <b> solve the problem </b> , then <i> write the code </u> </i> </p>
        
        sc.close();
        
	}
	
	public static void checker (String str) {
        	
        	Stack<String> stack  = new Stack<String>();
        	
        	boolean check = false;
        	
        	Scanner input = new Scanner(str);
        	while(input.hasNext()) {
        		
        		String string = input.next();
        		
            if(string.equals("<p>") || string.equals("<b>") || string.equals("<i>") || string.equals("<u>") ) {
                stack.push(string);
            }
            else if(string.equals("</p>")) {
            	if(stack.isEmpty()) {check = false; stack.push("</p>");}
            	else{
            		if(!stack.peek().equals("<p>")) {check = false; stack.push("</p>");}
            		else {check = true; stack.pop();}
            	}
            }
            else if(string.equals("</b>")) {
            	if(stack.isEmpty()) {check = false; stack.push("</b>");}
            	else{
            		if(!stack.peek().equals("<b>")) {check = false; stack.push("</b>");}
            		else {check = true; stack.pop();}
            	}
            }
            else if(string.equals("</i>")) {
            	if(stack.isEmpty()) {check = false; stack.push("</i>");}
            	else{
            		if(!stack.peek().equals("<i>")) {check = false; stack.push("</i>");}
            		else {check = true; stack.pop();}
            	}
            }
            else if(string.equals("</u>")) {
            	if(stack.isEmpty()) {check = false; stack.push("</u>");}
            	else{
            		if(!stack.peek().equals("<u>")) {check = false; stack.push("</u>");}
            		else {check = true; stack.pop();}
            	}
            }
            
        	}
        	 
        	if(!stack.isEmpty()) check = false;
        	
        	if(check==true || stack.isEmpty()){
        		System.out.println("Balance"); 
        	}
        	else {
        		System.out.println("Not balance");
        	}
        
        	input.close();
	}

}
