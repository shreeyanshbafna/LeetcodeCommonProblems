package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {


	public static void main(String[] args) {
		ShareBuffer buffer = new ShareBuffer(); // shared buffer instance
		Thread producer = new Thread(() -> {
			int value = 0;
			while (true) {
				try {
					buffer.produce(value++);
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread consumer = new Thread(() -> {
			try {

				while (true) {
					buffer.consume();
					Thread.sleep(4000);
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

		});
		producer.start();
		consumer.start();

	}
}

class ShareBuffer {
	private final Queue<Integer> queue = new LinkedList<>();
	private final int capacity = 5;

	public synchronized void produce(int value) throws InterruptedException {
		while (queue.size() == capacity) {
			wait(); // wait if buffer is full
		}
		queue.add(value);
		System.out.println("Produced: " + value);
		notifyAll(); // notify consumers}
	}

	public synchronized int consume() throws InterruptedException {
		while (queue.isEmpty()) {
			wait(); // wait if buffer is empty
		}
		int value = queue.poll();
		System.out.println("Consumed: " + value);
		notifyAll(); // notify producers
		return value;
	}
}