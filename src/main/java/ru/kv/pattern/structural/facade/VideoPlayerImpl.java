package ru.kv.pattern.structural.facade;

import ru.kv.pattern.structural.facade.VideoFile.AudioStream;
import ru.kv.pattern.structural.facade.VideoFile.VideoStream;

/**
 * Facade (Фасад) - предоставляет простой интерфейс 
 * к сложной системе классов, библиотеке или фреймворку. 
 */
public class VideoPlayerImpl implements VideoPlayer {

	private VideoFile videoFile;
	private NativePlayer player;
	private NativeConverter converter; 
	private VideoFilter filter;
	
	
	public VideoPlayerImpl() {
		converter = new NativeConverter();
		filter = new VideoFilter();
	}

	@Override
	public void openFile(String path) {
		videoFile = new VideoFile(path);
	}

	@Override
	public void play() {
		VideoStream videoStream = videoFile.getVideoStream();
		AudioStream audioStream = videoFile.getAudioStream();
		player = new NativePlayer(videoStream, audioStream);
		player.play();
	}

	@Override
	public void pause() {
		if (player != null) {
			player.pause();
		}
	}

	@Override
	public void stop() {
		if (player != null) {
			player.stop();
		}
	}

	@Override
	public void convert(String path, String format) {
		converter.convert(path, format);
	}

	@Override
	public void merge(String dest, String... paths) {
		converter.merge(dest, paths);
	}

	@Override
	public void applyFilter(String filterType) {
		filter.applyFilter(videoFile.getVideoStream(), filterType);
	}

}
