package ru.kv.pattern.structural.facade;

import ru.kv.pattern.structural.facade.VideoFile.AudioStream;
import ru.kv.pattern.structural.facade.VideoFile.VideoStream;

public class NativePlayer {
	
	private VideoStream videoStream;
	private AudioStream audioStream;

	public NativePlayer(VideoStream videoStream, AudioStream audioStream) {
		this.videoStream = videoStream;
		this.audioStream = audioStream;
	}

	public void play() {
		System.out.println("[Play] >> " + videoStream + " : " + audioStream);
	}
	
	public void pause() {
		System.out.println("[Pause] || " + videoStream + " : " + audioStream);
	}
	
	public void stop() {
		System.out.println("[Stop] -- " + videoStream + " : " + audioStream);
	}

}
