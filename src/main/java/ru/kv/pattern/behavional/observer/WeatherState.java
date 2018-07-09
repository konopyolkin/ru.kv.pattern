package ru.kv.pattern.behavional.observer;

public class WeatherState {

	private float temperature;
	private float humidity;
	private int pressure;
	
	public WeatherState(float temperature, float humidity, int pressure) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public int getPressure() {
		return pressure;
	}

	@Override
	public String toString() {
		return "WeatherState [temperature=" + temperature 
				+ ", humidity=" + humidity 
				+ ", pressure=" + pressure + "]";
	}
	
}
