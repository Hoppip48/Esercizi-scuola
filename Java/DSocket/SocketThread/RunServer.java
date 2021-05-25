package DSocket.SocketThread;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class RunServer implements Runnable {

    private Socket skt;

    public RunServer(Socket skt) {
        this.skt = skt;
    }

    @Override
    public void run() {
        Scanner sc;
        PrintWriter scrittoreR;
        String s = "";

        try {
            sc = new Scanner(skt.getInputStream());
            scrittoreR = new PrintWriter(skt.getOutputStream());
            for (;;) {
                s = sc.nextLine();
                System.out.println(s);
                scrittoreR.println(s);
                scrittoreR.flush();
                if (s == "x")
                    break;
            }
            sc.close();
            scrittoreR.close();
        } catch (IOException ex) {
            System.out.println("chum bucket: " + ex);
        }

    }
}
