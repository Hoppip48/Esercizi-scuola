package CThreadisi.Tutorial;

public class RunMain extends Thread {
    public static void main(String[] args) {
        RunN p1 = new RunN("Primo: ");
        RunN p2 = new RunN("\t\tSecondo: ");
        RunN p3 = new RunN("\t\t\t\tterzo: ");
        RunInf i4 = new RunInf();
        RunStop s5 = new RunStop();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(i4);
        Thread t5 = new Thread(s5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}