package SocketUTCserver;

import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

public class serverSkt {
    public static void main(String[] Args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        while(true){
            Socket s = ss.accept();
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            HashMap<String, Integer> hm = new HashMap<String, Integer>();
            hm.put("Milano",1);
            hm.put("New York",-5);
            hm.put("Londra",2);
            hm.put("Sydney",10);
            String var = in.readLine();
            System.out.println(var);
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            c.add(Calendar.HOUR, hm.get(var)-1);
            pw.println(var+" "+c.getTime());
            s.close();
        }
    }
}