package ru.kv.pattern.generate.abstrct.factory;

import ru.kv.pattern.generate.abstrct.factory.usa.F22;
import ru.kv.pattern.generate.abstrct.factory.usa.TankAbrams;
import ru.kv.pattern.generate.abstrct.factory.usa.UsaWarrior;

public class UsaArmyFactory implements ArmyFactory {

	@Override
	public Warrior createWarrior() {
		return new UsaWarrior();
	}

	@Override
	public Tank createTank() {
		return new TankAbrams();
	}

	@Override
	public JetFighter createJetFighter() {
		return new F22();
	}

}
