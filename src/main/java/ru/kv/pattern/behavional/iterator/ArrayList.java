package ru.kv.pattern.behavional.iterator;

import java.util.Arrays;

public class ArrayList<T> implements Collection<T> {

	private Object[] data;
	private int size;
	private int stateId;	
	
	public ArrayList() {
		data = new Object[10];
		size = 0;
		stateId = 0;
	}


	@Override
	public Iterator<T> createIterator() {
		return new ArrayListIterator();
	}


	@Override
	public void add(T t) {
		stateId++;
		if (data.length <= size) {
			data = Arrays.copyOf(data, size * 2);
		}
		data[size] = t;
		size++;
	}


	@Override
	public void remove(T t) {
		if (size == 1) {
			if (t == data[0]) {
				stateId++;
				size--;
				return;
			}
		}
		for (int i = 0; i < size; i++) {
			if (t == data[i]) {
				stateId++;
				System.arraycopy(data, i+1, data, i, (size - i - 1));
				size--;
				return;
			}
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index < 0 || size <= index) {
			throw new IndexOutOfBoundsException();
		}
		
		return (T)data[index];
	}


	@Override
	public void set(int index, T t) {
		if (index < 0 || size <= index) {
			throw new IndexOutOfBoundsException();
		}
		
		data[index] = t;
	}

	private class ArrayListIterator implements Iterator<T> {
		
		private int index;
		private int stateId;
		
		public ArrayListIterator() {
			this.stateId = ArrayList.this.stateId;
		}
		
		private void checkStateId() {
			if (this.stateId != ArrayList.this.stateId) {
				throw new IllegalStateException();
			}
		}

		@Override
		public boolean hasMore() {
			checkStateId();
			return index < size;
		}

		@Override
		public T getNext() {
			checkStateId();
			@SuppressWarnings("unchecked")
			T t = (T) data[index];
			index++;
			return t;
		}
		
	}
	
}
