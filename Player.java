package player;


// This class will control  
public class Player {
	// Holds the player's name which will be collected at the start of the game.
	private String playerName;
	
	// This has the healthPoints the player has, if this reaches zero it will result in a 
	// game over, also once these numbers reach a certain treshhold, the players health state will change.
	private int healthPoints = 100;
	
	// This contains the hunger points which will go down periodicly, once it reaches a certain treshhold, the player's
	// health state will change, should this reach zero will result in a game over.
	private int hungerPoints = 100;
	
	// Similar to the hungerPoints but not related to thirst.
	private int thirstPoints = 100;
	
	// this is the base inventory space the player has, once they add an item to said inventory, this number will be used to keep track
	// of how much space the player has left. This can be increased with equipables 
	private int inventorySpace = 10;
	
	
	// cretes the Player object, will be constructed once the user inputs their name and confirm it
	public Player(String s) {this.playerName = s;}
	
	// Defaults thew player's health condition to Healthy
	HealthStates playerCondition = HealthStates.HEALTHY;
	
	
	// Retuns the player name should we need it. (Victory Message perhaps?)
	public String getPlayerName() {
		return playerName;
	}
	
	// Allows the update of player health on item use
	public void healYourself(int amount ) {
		
		this.healthPoints = healthPoints + amount;
		
		if(healthPoints == 100) {
			System.out.println("Health is already full");
		}
	}
	
	// Allows for an update on Player HP apon taking damage
	public void damageTaken(int amount) {
		this.healthPoints = healthPoints - amount;
	}
	
	
	// Returns the players HP
	public int getPlayerHealth() {
		return healthPoints;
	}
	
	
	
	
	// Changes the playerCondtion of the player should conditions be met
	public void updateHealthState() {
		switch(playerCondition) {
		case HEALTHY:
			System.out.println("Your are now Healthy");
			break;
		case INJURED:
			System.out.println("Your are Injured; time to pach yourself up");
			break;
		case HUNGRY:
			System.out.println("You are starting to starve, time to look for something");
			break;
		case DEHYDRATED:
			System.out.println("Dehydration is starting; best start to look into getting some water");
			break;
		case CRITACLYINJURED:
			System.out.println("Your injury BADLY, you won't make it if you don't fix it soon");
			break;
		}
	}
}
