package Leetcode;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

/*
class A {
    void read() throws IOException, FileNotFoundException {
        System.out.println("A reads");
    }
}

class B extends A {
    // What will happen here?
    @Override
    void read() throws FileNotFoundException { 
        System.out.println("B reads");
    }
}



*/
/*class A {
	void read() throws Exception {
		System.out.println("A reads");
	}
}

class B extends A {
	// What will happen here?
	@Override
	void read() throws IOException {
		System.out.println("B reads");
	}
}*/

class a {
	{
		System.out.println("a instace");
	}

	a() {
		System.out.println("a");
	}

	void print() {
		System.out.println("print from a");
	}
}

class b extends a {
	{
		System.out.println("b instance");
	}

	b() {
		System.out.println("b");
	}

	@Override
	void print() {
		System.out.println("print from b");
	}
}

public class leetcode {

	public static void main(String[] args) {
		a w = new b();// compi........
		w.print();
		b w1 = new b();

		// b w1 = new a();//compi........

		String s = "hiiii";
		s.chars().filter(x -> x > 26).mapToObj(c -> (char) c).collect(Collectors.toList());

		BlockingQueue<String> queue = new LinkedBlockingQueue<>();
		new Thread(() -> {
			System.out.println("hiiiiiiiii");
		}).start();
		new Thread(() -> {
			System.out.println("hiiiiiiiii1222");
		}).start();
		// Producer
		new Thread(() -> {
			try {
				queue.put("Hello");
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}).start();

		// Consumer
		new Thread(() -> {
			try {
				String value = queue.take();
				System.out.println("Got: " + value);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}).start();
		
		

	}
}
