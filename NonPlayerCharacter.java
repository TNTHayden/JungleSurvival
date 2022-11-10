package player;

// NonPlayerCharacter(NPC) are the AI characters in game that can interact with the player should the situation.
// This is abstract has we will have 2 types of NPCs; Humans and Animal, each with their own abilities but will have
// their own abilities in thier own subclasses.
public abstract class NonPlayerCharacter {
	
protected String Name;
	
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return Name;
	}
}
