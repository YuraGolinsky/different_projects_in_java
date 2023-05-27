import java.time.*;
import java.util.concurrent.locks.*;

class Main {
    static Lock lock = new ReentrantLock();



    public static void main(String[] args) throws java.lang.Exception {

        Thread worker = new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(20);
                    // если lock взят, мы будет ждать здесь
                    // если нет, мы его берём и тут же отпускаем
                    lock.lock();
                    lock.unlock();
                    System.out.println(LocalTime.now());
                }
            } catch (InterruptedException ex) {
            }
        });
        worker.start();
        Thread.sleep(100);
        System.out.println("Остановка потока ...");
        lock.lock();
        // теперь lock.lock() в другом потоке будет ждать
        Thread.sleep(500);
        lock.unlock();
        // в теперь не будет
        System.out.println("Продолжения потока");

        worker.join();
        for (int i = 0; i < 2; i++) {

            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }

    }

}