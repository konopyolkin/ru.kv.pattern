package ru.kv.pattern.structural.facade;

public class VideoFile {
	
	private String path;

	public VideoFile(String path) {
		this.path = path;
	}
	
	public VideoStream getVideoStream() {
		//...
		return new VideoStream();
	}

	public AudioStream getAudioStream() {
		//...
		return new AudioStream();
	}

	public class VideoStream {

		//...

		@Override
		public String toString() {
			return "VideoStream [" + path + "]";
		}
		
	}

	public class AudioStream {
		//...

		@Override
		public String toString() {
			return "AudioStream [" + path + "]";
		}

	}

	@Override
	public String toString() {
		return "VideoFile [path=" + path + "]";
	}
	
}
