import static org.junit.Assert.assertEquals;



public class TestEvaluateArithmeticExpression {
	@org.junit.Test
	public void TestEvaluate()throws Exception{
		String postfix= new InfixPostfix("2+7").Postfix();
		int evaluation = new EvaluateArithmeticExpression(postfix).Evalute();
		assertEquals(9, evaluation);
	}


}
