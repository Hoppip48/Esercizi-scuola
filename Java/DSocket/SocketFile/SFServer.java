package DSocket.SocketFile;

import java.net.*;

public class SFServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2000);
            Thread Tstop = new Thread(new RunnaStop());
            Tstop.start();
            while (true) {
                System.out.println("accettando...");
                Socket s = ss.accept();
                System.out.println("done");
                Thread Srun = new Thread(new RunServer(s));
                Srun.start();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
