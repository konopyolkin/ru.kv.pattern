package ru.kv.pattern.generate.builder.v1;

/**
 * Builder (Строитель) - предоставляет способ создания составного объекта 
 */
public class Proccessor {
	
	private final String name;
	private final int coreCount;
	private final int threadCount;
	private final int cacheCount;
	private final int baseFrequency;
	private final int turboFrequency;
	private final int cache;
	
	public static class Builder {
		
		private final String name;
		private int coreCount;
		private int threadCount;
		private int cacheCount;
		private int baseFrequency;
		private int turboFrequency;
		private int cache;
		
		public Builder(String name) {
			super();
			this.name = name;
		}

		public Builder coreCount(int coreCount) {
			this.coreCount = coreCount;
			return this;
		}

		public Builder threadCount(int threadCount) {
			this.threadCount = threadCount;
			return this;
		}

		public Builder cacheCount(int cacheCount) {
			this.cacheCount = cacheCount;
			return this;
		}

		public Builder baseFrequency(int baseFrequency) {
			this.baseFrequency = baseFrequency;
			return this;
		}

		public Builder turboFrequency(int turboFrequency) {
			this.turboFrequency = turboFrequency;
			return this;
		}

		public Builder cache(int cache) {
			this.cache = cache;
			return this;
		}
		
		public Proccessor build() {
			return new Proccessor(this);
		}
	}
	
	private Proccessor(Builder builder) {
		name = builder.name;
		coreCount = builder.coreCount;
		threadCount = builder.threadCount;
		cacheCount = builder.cacheCount;
		baseFrequency = builder.baseFrequency;
		turboFrequency = builder.turboFrequency;
		cache = builder.cache;
	}

	@Override
	public String toString() {
		return "Proccessor [name=" + name + ", coreCount=" + coreCount + ", threadCount=" + threadCount
				+ ", cacheCount=" + cacheCount + ", baseFrequency=" + baseFrequency + ", turboFrequency="
				+ turboFrequency + ", cache=" + cache + "]";
	}
	
}
