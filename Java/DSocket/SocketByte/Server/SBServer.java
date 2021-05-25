package SocketByte.Server;

import java.net.ServerSocket;
import java.net.Socket;

public class SBServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1235);
            Thread Tstop = new Thread(new RunnaStop());
            Tstop.start();
            while (true) {
                System.out.println("accettando...");
                Socket s = ss.accept();
                System.out.println("done\n\n");
                Thread Srun = new Thread(new RunServer(s));
                Srun.start();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
