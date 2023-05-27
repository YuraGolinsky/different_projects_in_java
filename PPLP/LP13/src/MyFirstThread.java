public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Состояние потока активное " + getName());
    }
}
