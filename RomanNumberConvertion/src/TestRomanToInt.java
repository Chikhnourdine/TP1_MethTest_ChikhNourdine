import static org.junit.Assert.*;
import junit.framework.Test;



public class TestRomanToInt {
	@org.junit.Test
	public void I_convet_to_1() throws Exception {
		assertEquals(1, new Romain("I").ToEntier());		
	}
	@org.junit.Test
	public void V_convet_to_5() throws Exception {
		assertEquals(5, new Romain("V").ToEntier());		
	}
	@org.junit.Test
	public void X_convet_to_10() throws Exception {
		assertEquals(10, new Romain("X").ToEntier());		
	}
	@org.junit.Test
	public void L_convet_to_50() throws Exception {
		assertEquals(50, new Romain("L").ToEntier());		
	}
	@org.junit.Test
	public void C_convet_to_100() throws Exception {
		assertEquals(100, new Romain("C").ToEntier());		
	}
	@org.junit.Test
	public void D_convet_to_500() throws Exception {
		assertEquals(500, new Romain("D").ToEntier());		
	}
	@org.junit.Test
	public void M_convet_to_1000() throws Exception {
		assertEquals(1000, new Romain("M").ToEntier());		
	}
}
