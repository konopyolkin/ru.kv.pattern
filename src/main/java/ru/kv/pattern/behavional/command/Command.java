package ru.kv.pattern.behavional.command;

public abstract class Command {

	protected TextEditor textEditor;
	private String backup;
	
	public Command(TextEditor textEditor) {
		super();
		this.textEditor = textEditor;
	}
	
	protected void backup() {
		backup = textEditor.getText();
	}
	
	public void undo() {
		textEditor.setText(backup);
	}
	
	public abstract boolean execute();

	@Override
	public String toString() {
		return "Command [textEditor=" + textEditor + ", backup=" + backup + "]";
	}
	
}
