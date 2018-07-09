package ru.kv.pattern.structural.flyweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeFactory {
	
	private static final TreeFactory INSTANCE = new TreeFactory();
	
	private Map<String, TreeType> treeTypes;

	private TreeFactory() {
		treeTypes = new HashMap<>();
	}
	
	public static TreeFactory getInstance() {
		return INSTANCE;
	}
	
	public TreeType getTreeType(String name, Color color, String texture) {
		if (treeTypes.containsKey(name)) {
			return treeTypes.get(name);
		}
		
		TreeType treeType = new TreeType(name, color, texture);
		treeTypes.put(name, treeType);
		return treeType;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(1024);
		sb.append("[TreeFactory] Cache:\n");
		Set<String> keys = treeTypes.keySet();
		for (String key : keys) {
			TreeType treeType = treeTypes.get(key);
			sb.append("   " + key + " => " + treeType + "\n");
		}
		sb.append("\n");
		return sb.toString();
	}

	
}
