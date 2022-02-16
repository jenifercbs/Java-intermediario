public class Testerunnable {

    public static void main(String[] args) {
        minhathreadrunnable thread1 = new minhathreadrunnable("#1", 500);
        minhathreadrunnable thread2 = new minhathreadrunnable("#2", 700);
        minhathreadrunnable thread3 = new minhathreadrunnable("#3", 900);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread1);
        Thread t3 = new Thread(thread1);

        t1.start();
        t2.start();
        t3.start();

    }
    
}
