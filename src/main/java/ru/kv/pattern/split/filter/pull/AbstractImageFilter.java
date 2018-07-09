package ru.kv.pattern.split.filter.pull;

public abstract class AbstractImageFilter implements Source {
	
	private Source source;

	public AbstractImageFilter(Source source) {
		this.source = source;
	}

	@Override
	public Image getImage() {
		return source.getImage();
	};
	
}
