package ru.kv.pattern.behavional.chain.v1;

/**
 * Chain of responsibility (Цепочка обязанностей) - позволяет
 * передавать запросы последовательно по цепочке обработчиков.
 * Каждый последующий обработчик решает, может ли он обработать
 * запрос сам и стоит ли передавать запрос по цепи. 
 */
public class Example {

	public static void main(String[] args) {
		Button button1 = new Button();

		Button button2 = new Button();
		button2.setToolTip("Press button F2");

		Panel panel = new Panel();
		panel.setTextHelp("Let's go the menu F1");
		
		Dialog dialog = new Dialog();
		dialog.setWikiPageHelp("http://www.help.com/wiki/p123");
		
		panel.addComponent(button1);
		panel.addComponent(button2);
		dialog.addComponent(panel);
		
		
		button1.showHelp();
		System.out.println();
		
		button1.setToolTip("Press button F1");
		button1.showHelp();
		button2.showHelp();
		System.out.println();
		
		dialog.showHelp();
	}

}
