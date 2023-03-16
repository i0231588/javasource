package inter;

public interface PlayingCard {
	public static final int SPADE = 4;
	final int DIAMOND = 3;
	static int heart = 2;
	int clover = 1;
	
	public abstract String getCardNumber();
		String getCardKind();
		

}
