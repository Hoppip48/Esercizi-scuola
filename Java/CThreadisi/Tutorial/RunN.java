package CThreadisi.Tutorial;

public class RunN implements Runnable {
    String s;

    public RunN(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(s + i);
        }
    }
}
