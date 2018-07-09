package ru.kv.pattern.behavional.state;

/**
 * State (Состояние) - позволяет объектам менять поведение 
 * в зависимости от своего состояния. Извне создается впечатление,
 * что изменился класс объекта.
 */
public abstract class State {
	
	protected Player player;

	public State(Player player) {
		this.player = player;
	}

	public abstract String onLock();
	
	public abstract String onPlay();
	
	public abstract String onNext();
	
	public abstract String onPrev();
	
}
