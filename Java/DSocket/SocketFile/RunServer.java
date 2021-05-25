package DSocket.SocketFile;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class RunServer implements Runnable {

    private Socket skt;

    public RunServer(Socket skt) {
        this.skt = skt;
    }

    @Override
    public void run() {
        try {
            File f = new File("o/SocketFile/chimp.txt");
            Scanner ft = new Scanner(f);
            PrintWriter pw = new PrintWriter(skt.getOutputStream());
            while (ft.hasNextLine()) {
                String data = ft.nextLine();
                pw.println(data);
                pw.flush();
            }
            ft.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
