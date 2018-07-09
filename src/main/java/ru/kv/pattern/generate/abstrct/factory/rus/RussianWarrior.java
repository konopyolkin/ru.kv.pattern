package ru.kv.pattern.generate.abstrct.factory.rus;

import ru.kv.pattern.generate.abstrct.factory.Warrior;

public class RussianWarrior implements Warrior {

	private final String name = "Пехотинец Россия";
	private final String rank = "Рядовой";
	private final int distanceDefeat = 800;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getRank() {
		return rank;
	}

	@Override
	public int getDistanceDefeat() {
		return distanceDefeat;
	}

	@Override
	public String toString() {
		return "RussianWarrior [name=" + name + ", rank=" + rank + ", distanceDefeat=" + distanceDefeat + "]";
	}
	
}
