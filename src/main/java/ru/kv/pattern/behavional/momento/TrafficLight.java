package ru.kv.pattern.behavional.momento;

public class TrafficLight {

	public enum TrafficLightState {
		inactive, red, yellow, green;
	}
	private TrafficLightState state;
	
	
	public TrafficLight() {
		setTrafficLightState(TrafficLightState.inactive);
	}
	
	
	public void turnOff() {
		setTrafficLightState(TrafficLightState.inactive);
	}

	public void turnRed() {
		setTrafficLightState(TrafficLightState.red);
	}

	public void turnYellow() {
		setTrafficLightState(TrafficLightState.yellow);
	}

	public void turnGreen() {
		setTrafficLightState(TrafficLightState.green);
	}

	private void setTrafficLightState(TrafficLightState state) {
		if (state == null || this.state == state) {
			return;
		}
		
		this.state = state;
		System.out.println("Turned " + state);
	}
	
	
	public Snapshot save() {
		return new Snapshot(state);
	}
	
	public void restore(Snapshot snapshot) {
		state = snapshot.getState();
		System.out.println("Restore: " + state);
	}
	
	
	public class Snapshot {
		
		private TrafficLightState state;

		public Snapshot(TrafficLightState state) {
			super();
			this.state = state;
		}
		
		public TrafficLightState getState() {
			return state;
		}

	}

}
