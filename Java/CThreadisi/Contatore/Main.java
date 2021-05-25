package CThreadisi.Contatore;

public class Main extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Conta());
        Thread t2 = new Thread(new RunStop());
        t1.start();
        t2.start();
    }
}
