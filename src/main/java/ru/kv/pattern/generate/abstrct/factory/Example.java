package ru.kv.pattern.generate.abstrct.factory;

public class Example {

	public static void main(String[] args) {
		ArmyFactory[] armyFactories = new ArmyFactory[] {
				new RusArmyFactory(),
				new UsaArmyFactory()
		};
		
		for (ArmyFactory armyFactory : armyFactories) {
			System.out.println("*** Армия ***");
			System.out.println("Воен: " + armyFactory.createWarrior());
			System.out.println("Танк: " + armyFactory.createTank());
			System.out.println("Истребитель: " + armyFactory.createJetFighter());
		}
	}

}
