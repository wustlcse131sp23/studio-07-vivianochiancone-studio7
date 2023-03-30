package studio7;

public class HockeyPlayer 
{
	private String name;
	private int jerseyNumber;
	
	public HockeyPlayer(String n, int jerseyNum, boolean isRightHanded)
	{
		this.name = n;
		this.jerseyNumber = jerseyNum;
	}
	
	public String shootDirection()
	{
		double randomNumber = Math.random();
		if (randomNumber < 0.33)
		{
			return "right";
		}
		
		else if (randomNumber < 0.66)
		{
			return "left";
		}
		
		else
		{
			return "either";
		}
	}
	
	public String shootHand()
	{
		double randomNumber = Math.random();
		if (randomNumber < 0.5)
		{
			return "right";
		}
		
		else
		{
			return "left";
		}

	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
