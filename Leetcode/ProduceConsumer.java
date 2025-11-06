package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ProduceConsumer {

	public static void main(String[] args) {
		Buffer buffer = new Buffer(5); // Capacity of 5
		Thread producer1 = new Thread(new producer(buffer));
		Thread consumer1 = new Thread(new consumer(buffer));
		producer1.start();
		consumer1.start();
	}
}

class Buffer {
	private final Queue<Integer> queues = new LinkedList<Integer>();
	private final int capacity;

	public Buffer(int capacity) {
		this.capacity = capacity;
	}

	public synchronized void produce(int value) throws InterruptedException {
		while (queues.size() == capacity) {
			System.out.println("Buffer full. Producer waiting...");
			wait();
		}
		queues.add(value);
		notify();
	}

	public synchronized int consume() throws InterruptedException {
		while (queues.isEmpty()) {
			System.out.println("Buffer empty. consumer waiting...");
			wait();
		}
		int value = queues.poll();
		notify();

		System.out.println("Produced: " + value);
		return value;

	}
}

class consumer implements Runnable {
	public final Buffer buffer;

	public consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			while (true) {
				buffer.consume();
				Thread.sleep(500); // Simulate delay

			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}

}

class producer implements Runnable {
	private final Buffer buffer; // declares a reference

	public producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		int value = 0;
		try {
			while (true) {
				buffer.produce(value++);
				Thread.sleep(5000); // Simulate delay
				System.out.println("Consumed: " + value);

			}

		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}

}
