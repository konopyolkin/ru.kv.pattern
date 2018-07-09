package ru.kv.pattern.behavional.command;

public class PasteCommand extends Command {

	public PasteCommand(TextEditor textEditor) {
		super(textEditor);
	}

	@Override
	public boolean execute() {
		String buffer = textEditor.getBuffer();
		if (buffer == null || buffer.isEmpty()) {
			return false;
		}
		
		backup();
		textEditor.insertText(buffer);
		return true;
	}

}
