package DSocket.SocketThread;

import java.io.*;
import java.net.Socket;
import java.util.*;

public class EchoClientTcp {
    public static void main(String[] args) {
        Socket soc;
        BufferedReader lettoreR;
        Scanner ts = new Scanner(System.in);
        PrintWriter scrittoreR;
        String s;
        try {
            soc = new Socket("127.0.0.1", 2000);
            lettoreR = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            scrittoreR = new PrintWriter(soc.getOutputStream());
            do {
                s = ts.nextLine();
                scrittoreR.println(s);
                scrittoreR.flush();
                s = lettoreR.readLine();
                System.out.println(s);
            } while (s.equals("x"));
            lettoreR.close();
            scrittoreR.close();
            soc.close();
            ts.close();
        } catch (IOException ex) {
            System.out.println("" + ex);
        }
    }
}