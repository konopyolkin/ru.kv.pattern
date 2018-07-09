package ru.kv.pattern.basic.immutable;

/**
 * Шаблон Immutable (неизменяемый объект) - объект, который не может быть изменен после своего создания 
 */
public class Position {
	
	private final int x;
	private final int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Position offset(int x, int y) {
		return new Position(x, y);
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		Position position = new Position(10, 20);
		System.out.println(position);
		
		position = position.offset(55, 77);
		System.out.println(position);
	}

}
