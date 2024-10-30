package studio7;

public class HockeyPlayer 
{
//	private String name;
//	private int jerseyNumber;
//	private boolean isRightHanded;
//	private int[] stats;
//	
//	//hockey player constructor
//	public HockeyPlayer(String n, int jerseyNum, boolean isRightHanded, int[] goalsPerGame)
//	{
//		this.name = n;
//		this.jerseyNumber = jerseyNum;
//		this.isRightHanded = isRightHanded;
//		this.stats = goalsPerGame;
//	}
//	
//	public String shootDirection()
//	{
//		double randomNumber = Math.random();
//		if (randomNumber < 0.33)
//		{
//			return "right";
//		}
//		
//		else if (randomNumber < 0.66)
//		{
//			return "left";
//		}
//		
//		else
//		{
//			return "either";
//		}
//	}
//	
//	public String shootHand()
//	{
//		double randomNumber = Math.random();
//		if (randomNumber < 0.5)
//		{
//			return "shoots right";
//		}
//		
//		else
//		{
//			return "shoots left";
//		}
//
//	}
//	
//	public int[] getStats()
//	{
//		return this.stats;
//	}
//	
//	public void setStats(int[] stats)
//	{
//		this.stats = stats;
//	}
	
	private String name;           // Name of the player
    private int jerseyNumber;      // Jersey number
    private String shootingSide;   // "right", "left", or "both"
    private String handedness;      // "right" or "left"
    
    // Statistics
    private int totalGoals;        // Total goals scored
    private int totalAssists;      // Total assists made
    private int totalPoints;        // Total points (goals + assists)
    private int gamesPlayed;        // Total games played

    // Constructor
    public HockeyPlayer(String name, int jerseyNumber, String shootingSide, String handedness) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.shootingSide = shootingSide;
        this.handedness = handedness;
        this.totalGoals = 0;
        this.totalAssists = 0;
        this.totalPoints = 0;
        this.gamesPlayed = 0;
    }

    // Method to record a game
    public void completeGame(int goals, int assists) {
        this.totalGoals += goals;            // Update total goals
        this.totalAssists += assists;        // Update total assists
        this.totalPoints += (goals + assists); // Update total points
        this.gamesPlayed++;                   // Increment games played
    }

    // Getters for statistics
    public String getName() {
        return name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getShootingSide() {
        return shootingSide;
    }

    public String getHandedness() {
        return handedness;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    // toString method to represent the player
    @Override
    public String toString() {
        return "HockeyPlayer{" +
                "name='" + name + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", shootingSide='" + shootingSide + '\'' +
                ", handedness='" + handedness + '\'' +
                ", totalGoals=" + totalGoals +
                ", totalAssists=" + totalAssists +
                ", totalPoints=" + totalPoints +
                ", gamesPlayed=" + gamesPlayed +
                '}';
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HockeyPlayer player = new HockeyPlayer("Alex Ovechkin", 8, "left", "right");

        // Simulating games played
        player.completeGame(2, 1); // Game 1: 2 goals, 1 assist
        player.completeGame(1, 0); // Game 2: 1 goal, 0 assists

        // Display player statistics
        System.out.println(player); // Outputs: Player statistics

        // Display individual stats
        System.out.println("Total Goals: " + player.getTotalGoals()); // Outputs: Total Goals
        System.out.println("Total Assists: " + player.getTotalAssists()); // Outputs: Total Assists
        System.out.println("Total Points: " + player.getTotalPoints()); // Outputs: Total Points
        System.out.println("Games Played: " + player.getGamesPlayed()); // Outputs: Games Played

	}

}
