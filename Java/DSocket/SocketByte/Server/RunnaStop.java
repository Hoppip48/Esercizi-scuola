package SocketByte.Server;

import java.util.Scanner;

public class RunnaStop implements Runnable {
    @Override
    public void run() {
        Scanner ts = new Scanner(System.in);
        ts.nextLine();
        ts.close();
        System.exit(0);
    }

}
