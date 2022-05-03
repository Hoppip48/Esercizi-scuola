package SocketUTCclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.io.IOException;
import java.util.Scanner;


public class ClinetSkt {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",9999);
        Scanner t = new Scanner(System.in);
        System.out.println(
                "Scegli città orario desiderato\n"+
                        "Milano\n"+ // UTC+2
                        "New York\n"+ // UTC-4
                        "Londra\n"+ // UTC+1
                        "Sydney" // UTC+10
        );

        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println(t.nextLine());

        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(bf.readLine());
        s.close();
    }
}