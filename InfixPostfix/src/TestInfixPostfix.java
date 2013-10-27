import static org.junit.Assert.assertEquals;
import junit.framework.Test;

import org.junit.Assert;



public class TestInfixPostfix {
	@org.junit.Test
	public void InPostfic()throws Exception{
		String postfix= new InfixPostfix("2*(3+5)*(4+6)").Postfix();
		assertEquals("235+*46+*", postfix);
	}

}
