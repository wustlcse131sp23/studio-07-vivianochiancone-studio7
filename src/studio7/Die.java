package studio7;

public class Die {
	
	private int numSides;
	
	public Die(int numSides) {
		this.numSides = numSides;
	}
	
	public int roll()
	{
		return (int)(Math.random() * numSides) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die d1 = new Die(6);
		System.out.print(d1.roll());

	}

}
