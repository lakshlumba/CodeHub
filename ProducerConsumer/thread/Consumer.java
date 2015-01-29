package javapractice.thread;

import java.util.Vector;

public class Consumer implements Runnable{
	private final Vector sharedQueue;
	private final int SIZE;
	
	public Consumer(Vector sharedQueue, int SIZE) {
		this.sharedQueue = sharedQueue;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {
		while (true) {
            try {
                System.out.println("Consumed: " + consume());
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }		
	}
	 private int consume() throws InterruptedException {
	        //wait if queue is empty
	        while (sharedQueue.isEmpty()) {
	            synchronized (sharedQueue) {
	                System.out.println("Queue is empty " + Thread.currentThread().getName()
	                                    + " is waiting , size: " + sharedQueue.size());

	                sharedQueue.wait();
	            }
	        }

	        //Otherwise consume element and notify waiting producer
	        synchronized (sharedQueue) {
	            sharedQueue.notifyAll();
	            return (Integer) sharedQueue.remove(0);
	        }
	    }
}
