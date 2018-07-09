package ru.kv.pattern.structural.bridge;

import java.util.List;

/**
 * Bridge (Мост) - разделяет один или несколько классов
 * на две отдельные иерархии - абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.  
 */
public abstract class BaseComputer implements Computer {
	
	protected Proccessor proccessor;

	public BaseComputer(Proccessor proccessor) {
		this.proccessor = proccessor;
	}
	
	public int sum(List<Integer> list) {
		if (list == null || list.isEmpty()) {
			return 0;
		}
		
		int sum = 0;
		for (Integer val : list) {
			if (val != null) {
				sum = proccessor.sum(sum, val);
			}
		}
		
		return sum;
	}
	
	public float mul(List<Float> list) {
		if (list == null || list.isEmpty()) {
			return 0;
		}
		
		float sum = 1.0f;
		for (Float val : list) {
			if (val != null) {
				sum = proccessor.mul(sum, val);
			}
		}
		
		return sum;
	}

	@Override
	public String toString() {
		return "Computer [" + proccessor + "]";
	}

}
