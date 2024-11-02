package assignment_Inheritance;

public class WizardsAndWarriors {

	public static void main(String[] args) {
		
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();
		
		System.out.println(warrior.toString());
		System.out.println(warrior.isVulnerable());
		System.out.println(warrior.getDamagePoints(wizard));
		
		System.out.println(wizard.toString());
		System.out.println(wizard.isVulnerable()); //true
		System.out.println(wizard.getDamagePoints(warrior)); //without spell prepared
		wizard.prepareSpell();
		System.out.println("Spell prepared...");
		System.out.println(wizard.isVulnerable()); //false
		System.out.println(wizard.getDamagePoints(warrior)); //with spell prepared

	}

}

class Fighter{
	
	public boolean isVulnerable() {
		return false;
	}
	
	public int getDamagePoints(Fighter fighter) {
		return 0;
	}
	
}

class Warrior extends Fighter{
	
	@Override
	public boolean isVulnerable() {
		return false;
	}
	
	@Override
	public int getDamagePoints(Fighter fighter) {
		if(fighter.isVulnerable())
			return 10;
		else
			return 6;
	}
	
	@Override
	public String toString() {
		return "Fighter is Warrior";
	}
	
}

class Wizard extends Fighter{
	
	private boolean preparedSpell = false;
	
	public void prepareSpell() {
		preparedSpell = true;
	}
	
	@Override
	public boolean isVulnerable() {
		return !preparedSpell;
	}
	
	@Override
	public int getDamagePoints(Fighter fighter) {
		if(preparedSpell)
			return 12;
		else
			return 3;
	}
	
	@Override
	public String toString() {
		return "Fighter is Wizard";
	}
	
}
