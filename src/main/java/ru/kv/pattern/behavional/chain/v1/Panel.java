package ru.kv.pattern.behavional.chain.v1;

public class Panel extends ToolTipContainer {
	
	private String textHelp;

	public Panel() {
	}
	
	public String getTextHelp() {
		return textHelp;
	}

	public void setTextHelp(String textHelp) {
		this.textHelp = textHelp;
	}

	@Override
	public void showHelp() {
		if (textHelp != null && !textHelp.isEmpty()) {
			System.out.println("Panel: " + textHelp);
		} else {
			super.showHelp();
		}
	}

	@Override
	public String toString() {
		return "Panel [textHelp=" + textHelp + "]";
	}
	
}
