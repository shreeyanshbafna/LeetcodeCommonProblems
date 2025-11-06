package javaforgood;

public class PrintWithNThread {
	static int value = 0;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(() -> {	
			while (value < 200) {
				synchronized (lock) {

					if (value % 2 == 0) {
						System.out.println(value);
						value++;
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		Thread t2 = new Thread(() -> {
			while (value < 200) {
				synchronized (lock) {

					if (value % 2 != 0) {
						System.out.println(value);
						value++;
						lock.notify();
					} else {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
}
