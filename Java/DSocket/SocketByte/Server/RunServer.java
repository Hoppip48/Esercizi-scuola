package SocketByte.Server;

import java.net.*;

import java.io.*;

public class RunServer implements Runnable {

    private Socket soc;

    public RunServer(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream("SocketByte//Server//aaahh.png");
            OutputStream os = soc.getOutputStream();
            byte[] b = new byte[256];
            while (fis.read(b) != -1) {
                os.write(b);
                os.flush();
            }
            os.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
