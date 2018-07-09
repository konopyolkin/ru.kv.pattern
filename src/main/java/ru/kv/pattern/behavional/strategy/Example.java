package ru.kv.pattern.behavional.strategy;

import java.util.Random;

/**
 * Strategy (Стратегия) - определяет семейство схожих 
 * алгоритмов и помещает каждый из них  в собственный 
 * класс,  после чего алгоритмы  можно взаимозаменять
 * прямо во время исполнения программы.
 */
public class Example {
	
	private static final Random RANDOM = new Random();

	public static void main(String[] args) {
		Strategy[] strategies = new Strategy[] {
				new StrategyAdd(),
				new StrategySubtract(),
				new StrategyMultiply()
		};
		
		Context context = new Context();

		double a = 3.5d;
		double b = 2.2d;
		for (int i = 0; i < 10; i++) {
			Strategy strategy = strategies[RANDOM.nextInt(strategies.length)];
			
			context.setStrategy(strategy);
			
			System.out.println(strategy + " => " +context.executeStartegy(a, b));
		}
	}

}
