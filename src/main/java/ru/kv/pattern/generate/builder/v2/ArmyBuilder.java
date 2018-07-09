package ru.kv.pattern.generate.builder.v2;

public abstract class ArmyBuilder {
	
	protected Army army;
	
	public Army getArmy() {
		return army;
	}
	
	public void createArmy() {
		army = new Army();
	}

	public abstract void buildWarriors();
	
	public abstract void buildTank();
	
	public abstract void buildJetFighter();
	
}
