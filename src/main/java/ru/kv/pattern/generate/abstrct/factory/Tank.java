package ru.kv.pattern.generate.abstrct.factory;

/** Танк */
public interface Tank {

	/** Название танка */
	public String getName();
	
	/** Экипаж (кол-во человек) */
	public int getCrew();
	
	/** Вес танка */
	public int getWeight();
	
	/** Скорость движения */
	public int getSpeed();
	
	/** Дальность поражения */
	public int getDistanceDefeat();
	
}
