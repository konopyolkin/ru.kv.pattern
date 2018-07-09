package ru.kv.pattern.concurrency.active.object;

public class Example {

	public static void main(String[] args) {
		final SafeSummator summator = new SafeSummator();
		summator.init();

		summator.addSummatorListener( (v) -> System.out.println("Result: " + v) );

		Runnable task = () -> {
			try {
				for (int i = 0; i < 1000; i++) {
					summator.add(i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		try {
		
			Thread t1 = new Thread(task);
			Thread t2 = new Thread(task);

			t1.start();
			t2.start();
		
			t1.join(1000);
			t2.join(1000);
			
			summator.finish();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		summator.destroy();

	}

}
