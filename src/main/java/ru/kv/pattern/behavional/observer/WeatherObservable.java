package ru.kv.pattern.behavional.observer;

public interface WeatherObservable {
	
	public void registerWeatherObserver(WeatherObserver observer);
	
	public void removeWeatherObserver(WeatherObserver observer);
	
	public void notifyWeatherObserver();
	
}
