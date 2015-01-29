package javapractice.thread;

import java.util.Vector;

public class Producer implements Runnable{
	private final Vector sharedQueue;
	private final int SIZE;
	
	public Producer(Vector sharedQueue, int SIZE) {
		super();
		this.sharedQueue = sharedQueue;
		this.SIZE = SIZE;
	}

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
            System.out.println("Produced: " + i);
            try {
                produce(i);
            } catch (InterruptedException ex) {
            		ex.printStackTrace();
            }

        }
		
	}
	private void produce(int i) throws InterruptedException {

        //wait if queue is full
        while (sharedQueue.size() == SIZE) {
            synchronized (sharedQueue) {
                System.out.println("Queue is full " + Thread.currentThread().getName()
                                    + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();
            }
        }

        //producing element and notify consumers
        synchronized (sharedQueue) {
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }
}
