package ru.kv.pattern.behavional.state;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class GuiPlayer {
	
	private Player player;
	
	private JPanel mainPanel;
	private JTextField trackName;
	private JButton playButton;
	private JButton stopButton;
	private JButton nextButton;
	private JButton prevButton;
	
	
	public GuiPlayer(Player player) {
		this.player = player;
	}

	public void init() {
		
		playButton = new JButton("Play");
		playButton.addActionListener((event) -> {
			String text = player.getState().onPlay();
			trackName.setText(text);
		});

		stopButton = new JButton("Stop");
		stopButton.addActionListener((event) -> {
			String text = player.getState().onLock();
			trackName.setText(text);
		});

		nextButton = new JButton("Next");
		nextButton.addActionListener((event) -> {
			String text = player.getState().onNext();
			trackName.setText(text);
		});

		prevButton = new JButton("Prev");
		prevButton.addActionListener((event) -> {
			String text = player.getState().onPrev();
			trackName.setText(text);
		});

		JPanel actionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		actionPanel.add(prevButton);
		actionPanel.add(playButton);
		actionPanel.add(stopButton);
		actionPanel.add(nextButton);
		
		trackName = new JTextField(20);
		trackName.setHorizontalAlignment(SwingConstants.CENTER);
		
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(trackName, BorderLayout.CENTER);
		mainPanel.add(actionPanel, BorderLayout.SOUTH);
	}

	public Component getComponent() {
		return mainPanel;
	}
	
	/**
	 * State (Состояние) - позволяет объектам менять поведение 
	 * в зависимости от своего состояния. Извне создается впечатление,
	 * что изменился класс объекта.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player player = new Player();
					
					JFrame frame = new JFrame("GuiPlayer");
					GuiPlayer gplayer = new GuiPlayer(player);
					gplayer.init();
					frame.getContentPane().add(gplayer.getComponent());
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
