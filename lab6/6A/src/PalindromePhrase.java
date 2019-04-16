import java.util.Scanner;
import java.util.Stack;

public class PalindromePhrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int y = Integer.parseInt(sc.nextLine());
		for(int x=0; x<y; x++){
		
		Queue<Character> queue = new Queue<Character>();
        Stack<Character> stack = new Stack<Character>();
        
        String str = sc.nextLine();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        
        for(int i=0; i<str.length(); i++){
        	if(Character.isDigit(str.charAt(i)) || Character.isAlphabetic(str.charAt(i))){
        		str1 += str.charAt(i);
        	}
        }
        
        str1 = str1.toLowerCase();
        
        for(int i=0; i<str1.length(); i++){
        	stack.push(str1.charAt(i));
        	queue.enqueue(str1.charAt(i));
        }
        
        while(!stack.isEmpty() && !queue.isEmpty()){
        	str2 += stack.pop();
        	str3 += queue.dequeue();
        }
        
        //System.out.println(str2);
        //System.out.println(str3);
        
        if(!str2.equals(str3)){
        	System.out.println("No");
        }
        else{
        	System.out.println("Yes");
        }
        
		}
        
		/*
		 5
		 Racecar
		 java hackerRank
		 April 2017
		 A man, a plan, a canal, Panama!
		 A Toyota¡¯s a Toyota.
		 */
		
		sc.close();
		
	}

}
