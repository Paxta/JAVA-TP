public class Thread2 extends Thread {

    @Override
    public void run() {
        System.out.println("Квадрат числа - " + (int)Math.pow(Thread1.num,2));
    }
}