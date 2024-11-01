package assignment_methodOverloading;

public class GameMaster {
	
	public String describe(Character character) {
		return "You're a level "+character.getLevel()+" "+character.getCharacterClass()+" with "+character.getPoints()+" hit points.";
	}
	
	public String describe(Destination destination) {
		return "You're arrived at "+destination.getName()+" which has "+destination.getInhabitants()+" inhabitants.";
	}
	
	public String describe(TravelMethod travelMethod) {
		return "You're travelling to your destination on "+travelMethod+".";
	}
	
	public String describe(Character character,Destination destination,TravelMethod travelMethod) {
		return describe(character)+" "+describe(travelMethod)+" "+describe(destination);
	}
	
	public String describe(Character character,Destination destination) {
		return describe(character)+" "+describe(TravelMethod.WALKING)+" "+describe(destination);
	}

	public static void main(String[] args) {
		
		Character character = new Character();
		character.setCharacterClass("Wizard");
		character.setLevel(4);
		character.setHitPoints(28);

		Destination destination = new Destination();
		destination.setName("Muros");
		destination.setInhabitants(732);
		
		GameMaster gameMaster = new GameMaster();
		
		System.out.println(gameMaster.describe(character));
		System.out.println(gameMaster.describe(destination));
		System.out.println(gameMaster.describe(TravelMethod.HOSRSEBACK));
		System.out.println(gameMaster.describe(character, destination));
		System.out.println(gameMaster.describe(character, destination, TravelMethod.HOSRSEBACK));

	}

}

class Character{
	
	private String characterClass;
	private int level;
	private int points;
	
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPoints() {
		return points;
	}
	public void setHitPoints(int points) {
		this.points = points;
	}
	
}

class Destination{
	
	private String name;
	private int inhabitants;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInhabitants() {
		return inhabitants;
	}
	public void setInhabitants(int inhabitants) {
		this.inhabitants = inhabitants;
	}
	
}

enum TravelMethod{
	HOSRSEBACK,WALKING
}
