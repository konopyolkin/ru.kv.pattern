package ru.kv.pattern.behavional.command;

public class CutCommand extends Command {

	public CutCommand(TextEditor textEditor) {
		super(textEditor);
	}

	@Override
	public boolean execute() {
		String text = textEditor.getSelectedText();
		if (text == null || text.isEmpty()) {
			return false;
		}
		
		backup();
		textEditor.setBuffer(text);
		textEditor.removeSelectedText();
		return true;
	}

}
