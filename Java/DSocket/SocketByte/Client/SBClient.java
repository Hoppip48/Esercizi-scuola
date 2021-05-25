package SocketByte.Client;

import java.io.*;
import java.net.Socket;

public class SBClient {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("127.0.0.1", 1235);
            System.out.println("connettendo...");
            FileOutputStream fos = new FileOutputStream("SocketByte//Client//aaahh.png");
            InputStream is = soc.getInputStream();
            byte[] b = new byte[256];
            while (is.read(b) != -1) {
                fos.write(b);
                fos.flush();
            }
            fos.close();
            soc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
