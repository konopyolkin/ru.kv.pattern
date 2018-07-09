package ru.kv.pattern.generate.builder.v2;

/**
 * Builder (Строитель) - предоставляет способ создания составного объекта 
 */
public class Example {

	public static void main(String[] args) {
		Mobilization mobilization = new Mobilization();
		
		ArmyBuilder armyBuilder = new UsaArmyBuilder();
		mobilization.setArmyBuilder(armyBuilder);
		mobilization.mobilizeArmy();
		Army usaArmy = mobilization.getArmy();
		
		System.out.println(usaArmy);
		
		armyBuilder = new RusArmyBuilder();
		mobilization.setArmyBuilder(armyBuilder);
		mobilization.mobilizeArmy();
		Army rusArmy = mobilization.getArmy();
		
		System.out.println(rusArmy);
	}
}
