package ru.kv.pattern.structural.bridge;

import java.util.Arrays;
import java.util.List;

/**
 * Bridge (Мост) - разделяет один или несколько классов
 * на две отдельные иерархии - абстракцию и реализацию,
 * позволяя изменять их независимо друг от друга.  
 */
public class Example {

	public static void main(String[] args) {
		List<Integer> sumList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 , 9, 10);
		List<Float> mulList = Arrays.asList(0.1f, 0.2f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f , 0.9f, 0.10f);
		
		Computer computer = new DesktopPC(new IntelCoreI7());
		System.out.println(computer);
		System.out.println("sum=" + computer.sum(sumList));
		System.out.println("mul=" + computer.mul(mulList));
		System.out.println();
		
		computer = new Notebook(new AmdRyzen7());
		System.out.println(computer);
		System.out.println("sum=" + computer.sum(sumList));
		System.out.println("mul=" + computer.mul(mulList));
		System.out.println();
	}

}
