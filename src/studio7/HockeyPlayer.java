package studio7;

public class HockeyPlayer 
{
	private String name;
	private int jerseyNumber;
	private boolean isRightHanded;
	private int[] stats;
	
	//hockey player constructor
	public HockeyPlayer(String n, int jerseyNum, boolean isRightHanded, int[] goalsPerGame)
	{
		this.name = n;
		this.jerseyNumber = jerseyNum;
		this.isRightHanded = isRightHanded;
		this.stats = goalsPerGame;
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
			return "shoots right";
		}
		
		else
		{
			return "shoots left";
		}

	}
	
	public int[] getStats()
	{
		return this.stats;
	}
	
	public void setStats(int[] stats)
	{
		this.stats = stats;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
