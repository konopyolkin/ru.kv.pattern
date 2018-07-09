package ru.kv.pattern.generate.builder.v2;

public class UsaArmyBuilder extends ArmyBuilder {

	@Override
	public void buildWarriors() {
		army.setWarriorCount(1_400_000);
	}

	@Override
	public void buildTank() {
		army.setTankCount(8_848);
	}

	@Override
	public void buildJetFighter() {
		army.setJetFighterCount(13_892);
	}

}
