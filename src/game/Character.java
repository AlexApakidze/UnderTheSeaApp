package game;

public class Character implements Combatable {
	private String name;
	private double atk;
	private double def;
	private double hp;

	
	
	public Character() {
		super();
	}

	public Character(String name, double atk, double def, double hp) {
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAtk() {
		return atk;
	}

	public void setAtk(double atk) {
		this.atk = atk;
	}

	public double getDef() {
		return def;
	}

	public void setDef(double def) {
		this.def = def;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

}
