package threads;

public class Deadlock {

    public static void main(String[] args) {
        // Create two resources
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        // Create two threads that will acquire resources in different order, leading to a potential deadlock
        Thread thread1 = new Thread(() -> {
            resource1.acquire();
            resource2.acquire();
        });

        Thread thread2 = new Thread(() -> {
            resource2.acquire();
            resource1.acquire();
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }

    static class Resource {
        private final String name;

        public Resource(String name) {
            this.name = name;
        }

        public synchronized void acquire() {
            System.out.println(Thread.currentThread().getName() + " acquired " + name);
            // Introduce a delay to increase the chance of deadlock occurrence
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
