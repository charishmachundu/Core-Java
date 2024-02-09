package threads;

public class PrintNumbers {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> printEvenNumbers());
        Thread oddThread = new Thread(() -> printOddNumbers());

        evenThread.start();
        oddThread.start();
    }

    private static void printEvenNumbers() {
        synchronized (lock) {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println("Even: " + i);
                try {
                    // Adding a small delay for better visibility of interleaved output
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void printOddNumbers() {
        synchronized (lock) {
            for (int i = 1; i <= 59; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    // Adding a small delay for better visibility of interleaved output
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
