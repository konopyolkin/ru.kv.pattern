package ru.kv.pattern.split.filter.push;

public abstract class AbstactImageSink implements Sink {

	private Sink sink;

	public AbstactImageSink(Sink sink) {
		this.sink = sink;
	}

	@Override
	public void putImage(Image image) {
		sink.putImage(image);
	}
	
	
}
