package ru.kv.pattern.behavional.strategy;

/**
 * Strategy (Стратегия) - определяет семейство схожих 
 * алгоритмов и помещает каждый из них  в собственный 
 * класс,  после чего алгоритмы  можно взаимозаменять
 * прямо во время исполнения программы.
 */
public interface Strategy {
	
	public double execute(double a, double b);

}
