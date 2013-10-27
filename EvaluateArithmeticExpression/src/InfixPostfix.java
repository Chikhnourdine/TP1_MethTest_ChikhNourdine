import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

public class InfixPostfix{
	private final  String infix;
	public InfixPostfix(String infix)
	{
		this.infix = infix;
	}
	public String Postfix ()
	{
		int length = infix.length();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder postfix = new StringBuilder();
 
		for (int i = 0; i < length; i++)
		{
			if ((infix.charAt(i) >= '0') && (infix.charAt(i) <= '9'))
			{
				postfix.append(infix.charAt(i));
			}
			else if (infix.charAt(i) == '(')
			{
				stack.push(infix.charAt(i));
			}
			else if ((infix.charAt(i) == '*') || (infix.charAt(i) == '+') || (infix.charAt(i) == '-') || (infix.charAt(i) == '/'))
			{
				while ((stack.size() > 0) && (stack.peek() != '('))
				{
					if (ComparePrecedence(stack.peek(), infix.charAt(i)))
					{
						postfix.append(stack.pop());
					}
					else
					{
						break;
					}
				}
				stack.push(infix.charAt(i));
			}
			else if (infix.charAt(i) == ')')
			{
				while ((stack.size() > 0) && (stack.peek() != '('))
				{
					postfix.append(stack.pop());
				}
				if (stack.size() > 0)
					stack.pop(); // popping out the left brace '('
			}
			else
        	{
        	}
		}
		while (stack.size() > 0)
		{
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}

	private static boolean ComparePrecedence(char top, char p_2)
	{
	    if (top == '+' && p_2 == '*') // + has lower precedence than *
	        return false;
	 
	    if (top == '*' && p_2 == '-') // * has higher precedence over -
	        return true;
	 
	    if (top == '+' && p_2 == '-') // + has same precedence over +
	        return true;
	 
	    return true;
	}
}