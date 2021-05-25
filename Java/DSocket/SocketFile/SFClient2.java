package DSocket.SocketFile;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SFClient2 {
    public static void main(String[] args) {
        Socket soc;
        Scanner scan;
        try {
            soc = new Socket("127.0.0.1", 2000);
            System.out.println("connettendo...");
            scan = new Scanner(soc.getInputStream());
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
