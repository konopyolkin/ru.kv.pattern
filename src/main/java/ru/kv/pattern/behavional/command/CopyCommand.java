package ru.kv.pattern.behavional.command;

public class CopyCommand extends Command {

	public CopyCommand(TextEditor textEditor) {
		super(textEditor);
	}

	@Override
	public boolean execute() {
		textEditor.setBuffer(textEditor.getSelectedText());
		return true;
	}

}
