package ru.kv.pattern.behavional.chain.v1;

public abstract class ToolTipComponent implements ToolTip {
	
	private String toolTipText;
	
	protected ToolTip next;

	
	public String getToolTip() {
		return toolTipText;
	}

	public void setToolTip(String toolTip) {
		this.toolTipText = toolTip;
	}

	@Override
	public void showHelp() {
		if (toolTipText != null && !toolTipText.isEmpty()) {
			System.out.println("ToolTipComponent: " + toolTipText);
		} else {
			if (next != null) {
				next.showHelp();
			} else {
				throw new RuntimeException("No more handlers");
			}
		}
	}

	@Override
	public String toString() {
		return "ToolTipComponent [toolTipText=" + toolTipText + ", next=" + next + "]";
	}
	
}
