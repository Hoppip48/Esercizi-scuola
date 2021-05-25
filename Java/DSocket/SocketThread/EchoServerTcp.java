package DSocket.SocketThread;

import java.net.*;

public class EchoServerTcp {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(2000);
            Thread Tstop = new Thread(new RunnaStop());
            Tstop.start();
            while (true) {
                Socket s = ss.accept();
                Thread Srun = new Thread(new RunServer(s));
                Srun.start();

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
