package ru.kv.pattern.generate.abstrct.factory;

/** Истребитель */
public interface JetFighter {
	
	/** Название танка */
	public String getName();
	
	/** Экипаж (кол-во человек) */
	public int getCrew();
	
	/** Дальность полета */
	public int getFlightDistance();
	
	/** Скорость полета */
	public int getSpeed();
	
	/** Высота полета */
	public int getFlyingHeight();

}
