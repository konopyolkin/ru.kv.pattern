package ru.kv.pattern.structural.facade;

/**
 * Facade (Фасад) - предоставляет простой интерфейс 
 * к сложной системе классов, библиотеке или фреймворку. 
 */
public class Example {

	public static void main(String[] args) {
		String filmPath = "/video/ForrestGump.mkv";

		VideoPlayer player = new VideoPlayerImpl();
		player.openFile(filmPath);
		player.applyFilter("Cinema mode");
		player.play();
		//...
		player.pause();
		//...
		player.stop();
		
		//...
		
		player.convert(filmPath, "OGG");
		
		//...
		
		player.merge("/video/Casablanca.avi", 
				"/video/part/1.avi", 
				"/video/part/2.avi", 
				"/video/part/3.avi");
	}

}
