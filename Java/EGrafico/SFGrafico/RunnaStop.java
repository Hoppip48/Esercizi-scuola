package EGrafico.SFGrafico;

import java.util.Scanner;

public class RunnaStop implements Runnable {

    @Override
    public void run() {
        Scanner ts = new Scanner(System.in);
        ts.nextLine();
        System.exit(0);
    }

}
