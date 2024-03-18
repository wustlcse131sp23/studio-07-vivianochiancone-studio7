package studio7;

public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d)
	{
		this.numerator = n;
		this.denominator = d;
	}
	
	public Fraction add(Fraction other)
	{
		int thisnum = this.numerator*other.denominator;
		int othernum = this.denominator*other.numerator;
		int denominator = this.denominator*other.denominator;
		return (new Fraction(thisnum + othernum, denominator));
	}
	
	public Fraction multiply(Fraction other)
	{
		int numerator = this.numerator*other.numerator;
		int denominator = this.denominator*other.denominator;
		return (new Fraction(numerator, denominator));
	}
	
	public Fraction reciprocal()
	{
		return (new Fraction(this.denominator, this.numerator));
	}
	
	//public Fraction simplify()
	{
		// did not finish b/c this just math, not learning about classes
		if (this.numerator % this.denominator == 0)
		{
			newNumerator = this.numerator/this.denominator;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 4);
		Fraction sum = f1.add(f2);
		System.out.println(sum.numerator);
		System.out.println(sum.denominator);
		

	}

}
