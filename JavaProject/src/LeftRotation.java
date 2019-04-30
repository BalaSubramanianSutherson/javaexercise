import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class LeftRotation {
	  static boolean isBalanced(String s) {
	        Stack stack = new Stack<String>();
	            
	        char[] ch = s.toCharArray();
	        boolean ismatch = false;
	        for (char c : ch) {
	            if (c == '{' || c == '(' || c == '[') {
	                stack.push(c);
	            }
	            if(!stack.isEmpty()) {
	                if (c == '}' || c == ')' || c == ']') {
	                    char cc = (char) stack.pop();
	                    if ((cc == '{' && c == '}') || (cc == '(' && c == ')') || (cc == '[' && c == ']')) {
	                        ismatch = true;
	                    } else {
	                        return false;
	                    }
	                }
	            }else {
	                return false;
	            }
	            
	        }
	        
	        if(ismatch && stack.isEmpty()) {
	            return true;
	        }else {
	            return false;
	        }
	    }
		public static void main(String []argh)
		{
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNext()) {
				String input=sc.next();
	           System.out.println(isBalanced(input));
			}
			
		}}
