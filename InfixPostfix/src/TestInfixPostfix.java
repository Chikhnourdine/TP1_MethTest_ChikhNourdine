import static org.junit.Assert.assertEquals;
import junit.framework.Test;

import org.junit.Assert;



public class TestInfixPostfix {
	@org.junit.Test
	public void InPostfic()throws Exception{
		assertEquals("12+", new InfixPostfix("1+2").ToPostfix());
	}

}
