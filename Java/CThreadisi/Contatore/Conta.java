package CThreadisi.Contatore;

public class Conta implements Runnable {
    @Override
    public void run() {
        for (int a = 0;; a++)
            for (int b = 0; b < 60; b++)
                for (int c = 0; c < 60; c++) {
                    try {
                        System.out.println("hh/mm/ss:      " + a + "/" + b + "/" + c);
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }

    }
}
