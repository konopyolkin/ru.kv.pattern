package ru.kv.pattern.structural.flyweight;

import java.awt.Color;

/**
 * Flyweight (Легковес/Приспособленец) - позволяет вместить
 * большое количество объектов в отведенную оперативную память.
 * Шаблон экономит память, разделяя общее состояние объектов
 * между собой, вместо хранения одинаковых данных в каждом
 * объекте. 
 */
public class Example {

	public static void main(String[] args) {
		Forest forest = new Forest();
		
		forest.plantTree(1, 1, "Ясень", Color.red, "type-1");
		forest.plantTree(2, 2, "Дуб", Color.blue, "type-2");
		forest.plantTree(3, 3, "Ясень", Color.red, "type-1");
		forest.plantTree(4, 4, "Ясень", Color.red, "type-1");
		forest.plantTree(5, 5, "Дуб", Color.blue, "type-2");
		forest.plantTree(6, 6, "Дуб", Color.blue, "type-2");
		
		forest.draw();
		
		System.out.println();
		
		System.out.println(TreeFactory.getInstance());
	}
	
}
