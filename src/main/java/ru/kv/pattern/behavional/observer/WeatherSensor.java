package ru.kv.pattern.behavional.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherSensor implements WeatherObservable {
	
	private List<WeatherObserver> observers;
	private float temperature;
	private float humidity;
	private int pressure;

	
	public WeatherSensor() {
		observers = new LinkedList<>();
	}

	public void changeTemperature(float temperature) {
		if (this.temperature == temperature) {
			return;
		}
		this.temperature = temperature;
		notifyWeatherObserver();
	}

	public void changeHumidity(float humidity) {
		if (this.humidity == humidity) {
			return;
		}
		this.humidity = humidity;
		notifyWeatherObserver();
	}

	public void changePressure(int pressure) {
		if (this.pressure == pressure) {
			return;
		}
		this.pressure = pressure;
		notifyWeatherObserver();
	}

	@Override
	public void registerWeatherObserver(WeatherObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeWeatherObserver(WeatherObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyWeatherObserver() {
		WeatherState state = new WeatherState(temperature, humidity, pressure);
		for (WeatherObserver observer : observers) {
			observer.update(state);
		}
	}

}
