package threadEx;

public class X implements Runnable {

	private int	currentValue;

	public X() {
		this.currentValue = 0;
	}

	public int getValue() {
		return this.currentValue;
	}

	@Override
	public void run() { // (1) Thread entry point
		try {
			while (this.currentValue < 5) {
				System.out.println(Thread.currentThread().getName() // (2) Print thread name.
						+ ": " + (this.currentValue++));
				Thread.sleep(250); // (3) Current thread sleeps.
			}
		}
		catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrupted.");
		}
		System.out.println("Exit from thread: " + Thread.currentThread().getName());
	}
}
