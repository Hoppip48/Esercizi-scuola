
package sfgrafico;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class RunServer implements Runnable {

    Socket soc;
    BufferedReader br;
    PrintWriter scrittoreR;
    DataOutputStream dout;
    String s;

    public RunServer(Socket soc) {
        this.soc = soc;
    }

    @Override
    public void run() {
        try {
            File f= new File("vuoto");
            File f1 = new File("C:\\Users\\franc\\OneDrive\\Desktop\\Non aprire\\chimp.txt");
            File f2 = new File("C:\\Users\\franc\\OneDrive\\Desktop\\Non aprire\\orango.txt");
            File f3 = new File("C:\\Users\\franc\\OneDrive\\Desktop\\Non aprire\\gorilla.txt");
            File f4 = new File("C:\\Users\\franc\\OneDrive\\Desktop\\Non aprire\\inglese.txt");
            //dout = new DataOutputStream(soc.getOutputStream());
            //PrintWriter dout = new PrintWriter(soc.getOutputStream());
            //dout.println(f1.getName()+"\n"+f2.getName()+"\n"+f3.getName());
            //dout.close();
            //DataInputStream din = new DataInputStream(soc.getInputStream());
            //String fs = din.readUTF();
            PrintWriter pw = new PrintWriter(soc.getOutputStream(),true);
            pw.println(f1.getName());
            pw.println(f2.getName());
            pw.println(f3.getName());
            pw.println(f4.getName());
            pw.println("ciao");
            Scanner sc = new Scanner(soc.getInputStream());
            String fs = sc.nextLine();
            if(fs.equals("chimp"))
                f=f1;
            else if(fs.equals("orango"))
                f=f2;
            else if(fs.equals("gorilla"))
                f=f3;
            else if(fs.equals("inglese"))
                f=f4;
            else if(fs.equals("vuoto"))
                System.out.println("x");
            else if(fs.equals("x"))
                System.exit(0);          
            /*if(f.getName().equals("vuoto")){
                dout = new DataOutputStream(soc.getOutputStream());
                dout.writeUTF(f1.getName()+"\n"+f2.getName()+"\n"+f3.getName());
        }*/  
            br = new BufferedReader(new FileReader(f));
            scrittoreR = new PrintWriter(soc.getOutputStream());
            while ((s = br.readLine()) != null) {
                scrittoreR.println(s);
                System.out.println("s: "+s);
                scrittoreR.flush();
            }
            br.close();
            scrittoreR.close();
            soc.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}