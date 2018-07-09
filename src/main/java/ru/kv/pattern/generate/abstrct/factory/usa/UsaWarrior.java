package ru.kv.pattern.generate.abstrct.factory.usa;

import ru.kv.pattern.generate.abstrct.factory.Warrior;

public class UsaWarrior implements Warrior {
	
	private final String name = "Пехотинец США";
	private final String rank = "Рядовой";
	private final int distanceDefeat = 1000;

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
		return "UsaWarrior [name=" + name + ", rank=" + rank + ", distanceDefeat=" + distanceDefeat + "]";
	}

}
