package ru.kv.pattern.generate.abstrct.factory.usa;

import ru.kv.pattern.generate.abstrct.factory.JetFighter;

public class F22 implements JetFighter{

	private final String name = "F-22";
	private final int crew = 1;
	private final int flightDistance = 3_220;
	private final int speed = 2_410;
	private final int flyingHeight = 20_000;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getCrew() {
		return crew;
	}

	@Override
	public int getFlightDistance() {
		return flightDistance;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public int getFlyingHeight() {
		return flyingHeight;
	}

	@Override
	public String toString() {
		return "F22 [name=" + name + ", crew=" + crew + ", flightDistance=" + flightDistance + ", speed=" + speed
				+ ", flyingHeight=" + flyingHeight + "]";
	}

}
