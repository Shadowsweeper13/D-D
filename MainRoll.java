package Rolls;

public class MainRoll extends D20Roller{
	
	
	public static void main (String[]args) {
		int attackModifier = 5;
		int damageModifier=2;
		int damageDiceSides = 6;
		int numDamageDice = 1;
		int targetAC = 14;
		AttackRoll attackRoll = new AttackRoll(attackModifier, damageModifier, damageDiceSides, numDamageDice);
		int attackResult = attackRoll.performAttack();
		if(attackResult - attackModifier == 20) {
			System.out.println("Natural 20! Critical Hit!");
		}
		int damage = attackRoll.calculateDamage();
		if(attackResult >= targetAC) {
			System.out.println("You rolled " + attackResult + " Hit");
			System.out.print("Total damage is " + damage);
		}
		else {
			System.out.print("You rolled " + attackResult + " Miss");
		}
	}
}
