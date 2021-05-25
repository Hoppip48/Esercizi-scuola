package EGrafico.SFGrafico;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SFGServer {

    public static void main(String[] args) {
        ServerSocket ss;
        Socket soc;
        Thread tstop = new Thread(new RunnaStop());
        tstop.start();

        try {
            ss = new ServerSocket(2001);
            while (true) {
                System.out.println("connessione...");
                soc = ss.accept();
                System.out.println("connesso");
                Thread t1 = new Thread(new RunServer(soc));
                t1.start();
            }
        } catch (IOException ex) {
            System.out.println("" + ex);
        }

    }

}
