package ru.kv.pattern.generate.abstrct.factory;

import ru.kv.pattern.generate.abstrct.factory.rus.RussianWarrior;
import ru.kv.pattern.generate.abstrct.factory.rus.Su35;
import ru.kv.pattern.generate.abstrct.factory.rus.TankT90;

public class RusArmyFactory implements ArmyFactory {

	@Override
	public Warrior createWarrior() {
		return new RussianWarrior();
	}

	@Override
	public Tank createTank() {
		return new TankT90();
	}

	@Override
	public JetFighter createJetFighter() {
		return new Su35();
	}

}
