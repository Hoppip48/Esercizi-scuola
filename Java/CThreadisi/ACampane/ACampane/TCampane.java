package ACampane;

public class TCampane implements Runnable {

    // Proprieta'
    String suono;
    int volte;

    // Costruttore
    public TCampane(String pSuono, int pVolte) {
        this.suono = pSuono;
        this.volte = pVolte;
    }

    // Override
    public void run() {
        for (int i = 0; i < volte; i++) {
            // Thread.currentThread().sleep(3000);
            System.out.println(suono + "-" + (i + 1) + " ");
        }
    }

}
