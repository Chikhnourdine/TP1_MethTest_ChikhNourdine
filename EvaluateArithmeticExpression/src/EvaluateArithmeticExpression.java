import java.util.Stack;


public class EvaluateArithmeticExpression {
	String postfix; 
	public EvaluateArithmeticExpression(String postfix){
		this.postfix = postfix;
	}	

	public int Evalute() {
		// TODO Auto-generated method stub
		return EvaluatePostFix(postfix);
	}
	public static int EvaluatePostFix(String postfix)
	{
	    Stack<Integer> resultStack = new Stack<Integer>();
	    int length = postfix.length();
	    for (int i = 0; i < length; i++)
	    {
	        if ((postfix.charAt(i) == '*') || (postfix.charAt(i) == '+') || (postfix.charAt(i) == '-') || (postfix.charAt(i) == '/'))
	        {
	            int result = ApplyOperator(resultStack.pop(), resultStack.pop(), postfix.charAt(i));
	            resultStack.push(result);
	        }
	        else if ((postfix.charAt(i) >= '0') || (postfix.charAt(i) <= '9'))
	        {
	            resultStack.push((int)(postfix.charAt(i) - '0'));
	        }
	        else
	        {
	        }
	    }
	    return resultStack.pop();
	}
	 
	private static int ApplyOperator(int p, int p_2, char p_3)
	{
	    switch (p_3)
	    {
	        case '+':
	            return p_2 + p;
	        case '-':
	            return p_2 - p;
	        case '*':
	            return p_2 * p;
	        case '/':
	            return p_2 / p;
	        default:
	            return -1;
	    }
	    //return -1;
	}

}
