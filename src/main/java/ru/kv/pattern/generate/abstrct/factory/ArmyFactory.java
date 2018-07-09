package ru.kv.pattern.generate.abstrct.factory;

/** Abstract factory (Абстрактная фабрика) - предоставляет интерфейс
 * для создания семейства  взаимосвязанных или взаимозависимых объектов,
 * не специфицируя их конкретных классов. */
public interface ArmyFactory {

	public Warrior createWarrior();
	
	public Tank createTank();
	
	public JetFighter createJetFighter();
	
}
