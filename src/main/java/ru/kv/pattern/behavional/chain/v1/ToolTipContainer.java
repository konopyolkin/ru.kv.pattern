package ru.kv.pattern.behavional.chain.v1;

import java.util.ArrayList;
import java.util.List;

public abstract class ToolTipContainer extends ToolTipComponent {
	
	private final List<ToolTip> components;

	public ToolTipContainer() {
		components = new ArrayList<>();
	}
	
	public void addComponent(ToolTipComponent component) {
		components.add(component);
		component.next = this;
	}
	
	public void removeComponent(ToolTipComponent component) {
		if (components.remove(component)) {
			component.next = null;
		}
	}

}
