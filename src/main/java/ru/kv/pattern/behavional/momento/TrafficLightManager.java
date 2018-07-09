package ru.kv.pattern.behavional.momento;

import java.util.Stack;

import ru.kv.pattern.behavional.momento.TrafficLight.Snapshot;

public class TrafficLightManager {
	
	private TrafficLight trafficLight;
	private Stack<TrafficLight.Snapshot> history;
	
	public TrafficLightManager(TrafficLight trafficLight) {
		super();
		this.trafficLight = trafficLight;
		history = new Stack<>();
	}
	
	public void turnOff() {
		backup();
		trafficLight.turnOff();
	}

	public void turnRed() {
		backup();
		trafficLight.turnRed();
	}

	public void turnYellow() {
		backup();
		trafficLight.turnYellow();
	}

	public void turnGreen() {
		backup();
		trafficLight.turnGreen();
	}
	
	private void backup() {
		history.push(trafficLight.save());
	}

	public void undo() {
		if (history.isEmpty()) {
			return;
		}
		
		Snapshot backup = history.pop();
		trafficLight.restore(backup);
	}
	
}
