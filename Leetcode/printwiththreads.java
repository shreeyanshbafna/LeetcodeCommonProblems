package javaforgood;

public class printwiththreads {
	static int value = 0;
	private static final Object lock = new Object();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for (int i = 0; i < n; i++) {
			final int threadid = i;
			Thread thread = new Thread(() -> {
				while (value < 100) {
					synchronized (lock) {
						if(value % n == threadid) {
							System.out.println(threadid+"   "+value);
							value++;
							lock.notifyAll();
						} else {try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
					}
				}
			});
			thread.start();
		}
	}
}
