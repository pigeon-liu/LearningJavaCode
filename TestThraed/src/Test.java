public class Test {


    private static class Counter {
        private long n = 0;
        public void increment() {
            n++;
        }

        public void decrement() {
            n--;
        }

        public long value() {
            return n;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final int COUNT = 1000_0000;
        Counter counter = new Counter();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                counter.increment();
            }
        }, "李四");
        thread.start();
        for (int i = 0; i < COUNT; i++) {
            counter.decrement();
        }
        thread.join();
        // 期望最终结果应该是 0
        System.out.println(counter.value());
    }



    public static void main3(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ": 我跑着呢");
                Thread.yield();
            }
        }, "李四");

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ": 我跑着呢");
            }
            }, "王五");
        thread1.start();
        thread2.start();
     }


    public static void main2(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t = new Thread(() -> {
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000_0000; i++) {}
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        Thread.sleep(10);
        synchronized (object) {
            for (int i = 0; i < 10; i++) {
                System.out.println(t.getState());
            }
            object.notify();
        }
        while (t.isAlive()) {
            System.out.println(t.getState());
        }
    }

    public static void main1(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 1000_0000; i++) { }
            }, "李四");
        System.out.println(t.getName() + ": " + t.getState());
        t.start();
        while (t.isAlive()) {
            System.out.println(t.getName() + ": " + t.getState());
        }
        System.out.println(t.getName() + ": " + t.getState());
    }
}
