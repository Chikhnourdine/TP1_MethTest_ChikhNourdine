
public class Romain {

	private final String romain;
	public Romain(String romain) {
		this.romain = romain;
		
	}
	public int ToEntier() {
		if (romain.equals("M"))
			return 1000;
		if (romain.equals("D"))
			return 500;
		if (romain.equals("C"))
			return 100;
		if (romain.equals("L"))
			return 50;
		if (romain.equals("X"))
			return 10;
		if (romain.equals("V"))
			return 5;
		
		return 1;
	}

}
