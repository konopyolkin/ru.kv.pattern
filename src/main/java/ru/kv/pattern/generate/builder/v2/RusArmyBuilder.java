package ru.kv.pattern.generate.builder.v2;

public class RusArmyBuilder extends ArmyBuilder {

	@Override
	public void buildWarriors() {
		army.setWarriorCount(766_000);
	}

	@Override
	public void buildTank() {
		army.setTankCount(15_398);
	}

	@Override
	public void buildJetFighter() {
		army.setJetFighterCount(3_429);
	}

}
