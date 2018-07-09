package ru.kv.pattern.structural.composite;

/**
 * Composite (Компоновщик) - позволяет сгруппировать множество
 * объектов в древовидную структуру, а затем работать с ней так,
 * как будто это единичный объект. 
 */
public class Example {

	public static void main(String[] args) {
		Panel panel = new Panel("FlowLayout");
		
		for (int i = 1; i < 4; i++) {
			panel.add(new Dot(i, i));
		}
		
		Frame frame = new Frame(100, 50);
		frame.add(panel);
		frame.add(new Circle(20, 10, 5));
		
		frame.draw();
		
		System.out.println();
		
		frame.move(11, 22);
		frame.draw();

		System.out.println();

		frame.remove(panel);
		frame.draw();
	}

}
