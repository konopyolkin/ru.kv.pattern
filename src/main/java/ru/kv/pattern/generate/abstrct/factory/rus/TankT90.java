package ru.kv.pattern.generate.abstrct.factory.rus;

import ru.kv.pattern.generate.abstrct.factory.Tank;

public class TankT90 implements Tank {

	private final String name = "T90";
	private final int crew = 3;
	private final int weight = 46;
	private final int speed = 70;
	private final int distanceDefeat = 5000; 
	
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
		return "TankT90 [name=" + name + ", crew=" + crew + ", weight=" + weight + ", speed=" + speed
				+ ", distanceDefeat=" + distanceDefeat + "]";
	}
}
