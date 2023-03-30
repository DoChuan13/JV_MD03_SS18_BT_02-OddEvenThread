package thread;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                if (i % 2 == 0) {
                    System.out.println("Even Number is " + i);
                    Thread.sleep(15);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
