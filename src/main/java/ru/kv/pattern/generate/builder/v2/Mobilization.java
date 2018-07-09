package ru.kv.pattern.generate.builder.v2;

public class Mobilization {
	
	private ArmyBuilder armyBuilder;

	public void setArmyBuilder(ArmyBuilder armyBuilder) {
		this.armyBuilder = armyBuilder;
	}

	public void mobilizeArmy() {
		armyBuilder.createArmy();
		armyBuilder.buildWarriors();
		armyBuilder.buildTank();
		armyBuilder.buildJetFighter();
	}
	
	public Army getArmy() {
		return armyBuilder.getArmy();
	}
	
}
