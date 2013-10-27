import static org.junit.Assert.*;
import junit.framework.Test;



public class TestRomanToInt {
	@org.junit.Test
	public void I_convet_to_1() throws Exception {
		Romain romain = new Romain("I");
		int entier = romain.ToEntier();
		assertEquals(1, entier);		
	}
}
