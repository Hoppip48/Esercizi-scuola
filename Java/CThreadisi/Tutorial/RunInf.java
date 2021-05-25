package CThreadisi.Tutorial;

public class RunInf implements Runnable {
    @Override
    public void run() {
        for (int i = 0;; i++)
            System.out.println("\t\t\t\t\tInfinito: " + i);
    }

}
