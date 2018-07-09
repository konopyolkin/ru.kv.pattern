package ru.kv.pattern.structural.facade;

import ru.kv.pattern.structural.facade.VideoFile.VideoStream;

public class VideoFilter {

	public VideoStream applyFilter(VideoStream videoStream, String filter) {
		System.out.println("Apply filter: " + videoStream);
		return videoStream;
	}
	
}
