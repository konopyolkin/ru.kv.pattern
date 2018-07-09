package ru.kv.pattern.behavional.state;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private State state;
	
	private boolean playing;
	private List<String> playList;
	private int currentTrack;
	
	
	public Player() {
		super();
		state = new ReadyState(this);
		playList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			playList.add("Track-"+i);
		}
	}
	
	
	public void changeState(State state) {
		if (state == null || state.equals(this.state)) {
			return;
		}
		
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
	
	
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	public boolean isPlaying() {
		return playing;
	}
	
	
	public String startPlayback() {
		return "Playing " + playList.get(currentTrack);
	}
	
	public String nextTrack() {
		currentTrack++;
		if (currentTrack >= playList.size()) {
			currentTrack = 0;
		}
		return "Playing " + playList.get(currentTrack);
	}
	
	public String prevTrack() {
		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = playList.size() - 1;
		}
		return "Playing " + playList.get(currentTrack);
	}
	
	public void resetCurrentTrackNumber() {
		currentTrack = 0;
	}

}
