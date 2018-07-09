package ru.kv.pattern.generate.abstrct.factory.rus;

import ru.kv.pattern.generate.abstrct.factory.JetFighter;

public class Su35 implements JetFighter {
	
	private final String name = "Су-35";
	private final int crew = 1;
	private final int flightDistance = 4_500;
	private final int speed = 2_500;
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
		return "Su35 [name=" + name + ", crew=" + crew + ", flightDistance=" + flightDistance + ", speed=" + speed
				+ ", flyingHeight=" + flyingHeight + "]";
	}
	
}
