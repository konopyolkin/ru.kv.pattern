package ru.kv.pattern.structural.decorator;

public class LimitLogger extends BaseLogger {
	
	private static final int MAX_MESSAGE_LENGHT = 16;
	private static final String ELLIPSIS = "...";
	private static final int ELLIPSIS_LENGHT = ELLIPSIS.length();
	
	private int lenght = MAX_MESSAGE_LENGHT;

	
	public LimitLogger(Logger logger) {
		super(logger);
	}

	
	public int getMessageLenght() {
		return lenght;
	}

	public void setMessageLenght(int lenght) {
		this.lenght = lenght;
	}


	@Override
	public void error(String msg) {
		if (msg != null && msg.length() > lenght) {
			String limitMsg = msg.substring(0, lenght-ELLIPSIS_LENGHT) + ELLIPSIS;
			super.error(limitMsg);
			return;
		}
		super.error(msg);
	}

	@Override
	public void debug(String msg) {
		if (msg != null && msg.length() > lenght) {
			String limitMsg = msg.substring(0, lenght-ELLIPSIS_LENGHT) + ELLIPSIS;
			super.debug(limitMsg);
			return;
		}
		super.debug(msg);
	}

}
