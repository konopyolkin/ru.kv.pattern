package ru.kv.pattern.behavional.momento;

/**
 * Memento (Снимок) - позволяет сохранять и восстанавливать 
 * прошлые состояния объектов, не раскрывая подробности их
 * реализации.  
 */
public class Example {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		TrafficLightManager manager = new TrafficLightManager(trafficLight);
		
		manager.turnRed();
		manager.turnYellow();
		manager.turnGreen();
		manager.turnOff();
		manager.turnGreen();
		manager.turnRed();
		
		manager.undo();
		manager.undo();
		manager.undo();
		manager.undo();
		manager.undo();
		manager.undo();
	}
	
}
