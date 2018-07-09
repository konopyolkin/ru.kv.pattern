package ru.kv.pattern.behavional.chain.v1;

public class Dialog extends ToolTipContainer {
	
	private String wikiPageHelp;

	public Dialog() {
	}

	public String getWikiPageHelp() {
		return wikiPageHelp;
	}

	public void setWikiPageHelp(String wikiPageHelp) {
		this.wikiPageHelp = wikiPageHelp;
	}

	@Override
	public void showHelp() {
		if (wikiPageHelp != null && !wikiPageHelp.isEmpty()) {
			System.out.println("Dialog: " + wikiPageHelp);
		} else {
			super.showHelp();
		}
	}

	@Override
	public String toString() {
		return "Dialog [wikiPageHelp=" + wikiPageHelp + "]";
	}
	
}
