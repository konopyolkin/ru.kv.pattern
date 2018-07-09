package ru.kv.pattern.behavional.command;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Command (Команда) - превращает запросы в объекты, позволяя
 * передавать их как аргументы при вызове методов, ставить запросы
 * в очередь, логировать их, а также поддерживать отмену операций. 
 */
public class TextEditor {
	
	private JPanel mainPanel;
	private JButton copyButton;
	private JButton cutButton;
	private JButton pasteButton;
	private JButton undoButton;
	private JTextArea textArea;
	
	private CommandHistory history;
	private String buffer;
	
	public TextEditor() {
		history = new CommandHistory();
	}
	
	public void init() {
		copyButton = new JButton("Copy");
		copyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executeCommand(new CopyCommand(TextEditor.this));
			}
		});
		
		cutButton = new JButton("Cut");
		cutButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executeCommand(new CutCommand(TextEditor.this));
			}
		});
		
		pasteButton = new JButton("Paste");
		pasteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executeCommand(new PasteCommand(TextEditor.this));
			}
		});
		
		undoButton = new JButton("Undo");
		undoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undo();
			}
		});
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(copyButton);
		buttonPanel.add(cutButton);
		buttonPanel.add(pasteButton);
		buttonPanel.add(undoButton);
		
		textArea = new JTextArea();
		textArea.setColumns(40);
		textArea.setRows(20);
		
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(buttonPanel, BorderLayout.NORTH);
		mainPanel.add(textArea, BorderLayout.CENTER);
	}

	public JComponent getComponent() {
		return mainPanel;
	}

	
	String getBuffer() {
		return buffer;
	}

	void setBuffer(String buffer) {
		this.buffer = buffer;
	}

	
	String getText() {
		return textArea.getText();
	}
	
	void setText(String text) {
		textArea.setText(text);
	}
	
	
	String getSelectedText() {
		return textArea.getSelectedText();
	}
	
	void insertText(String text) {
		textArea.insert(text, textArea.getCaretPosition());
	}
	
	void removeSelectedText() {
		textArea.cut();
	}
	
	
	private void executeCommand(Command c) {
		if (c.execute()) {
			history.push(c);
		}
	}
	
	private void undo() {
		if (history.isEmpty()) {
			return;
		}
		
		Command command = history.pop();
		if (command != null) {
			command.undo();
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame("TextEditor");
					TextEditor textEditor = new TextEditor();
					textEditor.init();
					frame.getContentPane().add(textEditor.getComponent());
					frame.pack();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
