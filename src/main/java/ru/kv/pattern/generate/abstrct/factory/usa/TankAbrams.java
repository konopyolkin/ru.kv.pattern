package ru.kv.pattern.generate.abstrct.factory.usa;

import ru.kv.pattern.generate.abstrct.factory.Tank;

public class TankAbrams implements Tank {

	private final String name = "Abrams";
	private final int crew = 4;
	private final int weight = 61;
	private final int speed = 67;
	private final int distanceDefeat = 4600; 
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getCrew() {
		return crew;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public int getDistanceDefeat() {
		return distanceDefeat;
	}

	@Override
	public String toString() {
		return "TankAbrams [name=" + name + ", crew=" + crew + ", weight=" + weight + ", speed=" + speed
				+ ", distanceDefeat=" + distanceDefeat + "]";
	}
}
