package ru.kv.pattern.structural.flyweight;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Forest {

	private List<Tree> trees;
	
	public Forest() {
		trees = new ArrayList<>();
	}
	
	public void plantTree(int x, int y, String name, Color color, String texture) {
		Tree tree =  new Tree(x, y, name, color, texture);
		trees.add(tree);
	}

	public void draw() {
		for (Tree tree : trees) {
			tree.draw();
		}
	}
	
}
