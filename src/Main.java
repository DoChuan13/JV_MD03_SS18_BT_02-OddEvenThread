import thread.EvenThread;
import thread.OddThread;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread odd = new Thread(oddThread);
        Thread even = new Thread(evenThread);
        odd.start();
        try {
            odd.join(0);
        } catch (Exception errException) {
            errException.printStackTrace();
        }
        even.start();
        try {
            even.join(0);
        } catch (Exception errException) {
            errException.printStackTrace();
        }
    }
}
