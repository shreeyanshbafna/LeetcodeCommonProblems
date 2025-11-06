package Leetcode;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProduceConsumerBlockingqueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> queues = new ArrayBlockingQueue<Integer>(10);
		Thread t1 = new Thread(new Consumer11(queues));
		Thread t2 = new Thread(new Producer11(queues));
		t1.start();
		t2.start();
	}

}

class Consumer11 implements Runnable {
	private final BlockingQueue<Integer> queue;

	public Consumer11(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				int value = queue.take(); // Blocks if queue is empty
				System.out.println("Consumed: " + value);
				Thread.sleep(500); // Simulate delay
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

class Producer11 implements Runnable {
	private final BlockingQueue<Integer> queue;

	public Producer11(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		int value = 0;
		try {
			while (true) {
				System.out.println("Produced: " + value);

				queue.put(value++);
			Thread.	sleep(500);
			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}
}