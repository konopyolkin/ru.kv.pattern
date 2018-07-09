package ru.kv.pattern.behavional.observer;

public class WeatherMonitor implements WeatherObserver {
	
	private float temperature;
	private float humidity;
	private int pressure;
	
	private WeatherObservable observable;

	public WeatherMonitor(WeatherObservable observable) {
		super();
		this.observable = observable;
		this.observable.registerWeatherObserver(this);
	}

	@Override
	public void update(WeatherState state) {
		temperature = state.getTemperature();
		humidity = state.getHumidity();
		pressure = state.getPressure();
		display();
	}
	
	private void display() {
		System.out.printf("Температура:%.1f гр. цельсия. Влажность:%.1f %%. Давление:%d мм.рт.ст.\n",
				temperature, humidity, pressure);
	}

}
