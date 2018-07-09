package ru.kv.pattern.behavional.observer;

/**
 * Observer (Наблюдатель) - создает механизм подписки,
 * позволяющий одним объектам следить и реагировать на
 * события, происходящие в других объектах. 
 */
public class Example {

	public static void main(String[] args) {
		WeatherSensor sensor = new WeatherSensor();
		WeatherMonitor monitor = new WeatherMonitor(sensor);
		
		sensor.changeTemperature(25);
		sensor.changeHumidity(60);
		sensor.changePressure(740);

		sensor.changeTemperature(30);
		sensor.changeHumidity(70);
		sensor.changePressure(750);
	}

}
