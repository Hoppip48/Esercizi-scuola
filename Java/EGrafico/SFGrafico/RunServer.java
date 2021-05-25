package EGrafico.SFGrafico;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class RunServer implements Runnable {

    Socket soc;
    BufferedReader lettoreF;
    PrintWriter scrittoreR;
    String s;

    public RunServer(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
        try {
            lettoreF = new BufferedReader(new FileReader(new File("EGrafico\\SFGrafico\\chimp.txt")));
            scrittoreR = new PrintWriter(soc.getOutputStream());
            while ((s = lettoreF.readLine()) != null) {
                scrittoreR.println(s);
                scrittoreR.flush();
            }
            lettoreF.close();
            scrittoreR.close();
            soc.close();
        } catch (IOException ex) {
            System.out.println("" + ex);
        }
    }
}
