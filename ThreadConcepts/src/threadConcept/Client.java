package threadConcept;

public class Client {

	public static void main(String[] args) {
		Counter counterA = new Counter(); // (4) Create a counter.
		Thread worker = new Thread(counterA, "Counter A");// (5) Create a new thread.
		System.out.println(worker);
		worker.start();
		try {
			int val = 0;
			do {
				// val = counterA.getValue(); // (7) Access the counter value.
				System.out.println("Counter value read by "
						+ Thread.currentThread().getName() + // (8) Print thread name.
						": " + val);
				val++;
				Thread.sleep(500);
			} while (val < 5);

		}
		catch (InterruptedException e) {

			System.out.println("The main thread is interrupted.");
		}

		System.out.println(worker.getName() + worker.getState());
		System.out.println("Exit from main() method."
				+ Thread.currentThread().getState() + Thread.currentThread().getName());
	}
}
