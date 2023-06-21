package game;

public interface Combatable {

	public static double combat(double attacker, double defender) {
		double dmgCalc = (Math.random() * 0.2 + 0.2);
		double damageDone = attacker - defender * dmgCalc;
		int trueDamage = (int) damageDone;
		
		int dodge = (int) (1 + Math.random() * 10);
		if (dodge == 1) {
			System.out.println("DODGE!");
			return 0;
		}
		return trueDamage;
	}
}
