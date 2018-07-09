package ru.kv.pattern.generate.prototype.v2;

import java.awt.Color;

/**
 * Prototype (Прототип) - позволяет копировать объекты любой 
 * сложности без привязки к их конкретным классам.
 * Все классы-прототипы имеют общий интерфейс, что позволяет
 * копировать объекты  не обращая внимания  на их конкретные
 * типы и получать  точную  копию.  Клонирование совершается
 * самим объектом-прототипом,  что позволяет ему скопировать
 * значение всех полей, даже приватные. 
 */
public class Example {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setX(1);
		rectangle.setY(2);
		rectangle.setWidth(100);
		rectangle.setHeight(50);
		rectangle.setColor(Color.red);
		
		System.out.println("New: " + rectangle);
		System.out.println("Clone: " + rectangle.clone());
		System.out.println();
		
		Circle circle = new Circle();
		circle.setX(3);
		circle.setY(4);
		circle.setRadius(20);
		circle.setColor(Color.blue);
		
		System.out.println("New: " + circle);
		System.out.println("Clone: " + circle.clone());
		System.out.println();
		
		Shape shape = circle;
		
		System.out.println("Clone: " + shape.clone());
		System.out.println();
	}

}
