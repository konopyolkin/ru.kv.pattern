package ru.kv.pattern.behavional.iterator;

/**
 * Iterator (Итератор) - дает возможность последовательно обходить
 * элементы составных объектов, не раскрывая их внутреннего представления. 
 */
public class Example {

	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<>();
		
		for (int i = 0; i < 20; i++) {
			collection.add(i);			
		}
		
		Iterator<Integer> iterator = collection.createIterator();
		while (iterator.hasMore()) {
			System.out.print(iterator.getNext() + " ");
		}
		System.out.println();

		//Удаляем каждый третий элемент
		
		for (int i = 0; i < 20; i++) {
			if (i % 3 == 0) {
				collection.remove(i);
			}
		}
		
		iterator = collection.createIterator();
		while (iterator.hasMore()) {
			System.out.print(iterator.getNext() + " ");
		}
		System.out.println();

		//Удаляем элемент во время итерации (это должно привести к ошибке)
		
		int i = 0;
		iterator = collection.createIterator();
		while (iterator.hasMore()) {
			if (i == 5) {
				collection.remove(1);
			}
			System.out.print(iterator.getNext() + " ");
			i++;
		}
		System.out.println();
	}
}
