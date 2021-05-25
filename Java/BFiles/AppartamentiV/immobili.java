package BFiles.AppartamentiV;

import java.io.*;
import java.util.ArrayList;

public class immobili {

    public ArrayList<appartamenti> elenco;

    public immobili() {
        this.elenco = new ArrayList<>();
    }

    public void agg(int nstanze, double dmare, double pmq, double nmq, String tipo) {
        elenco.add(new appartamenti(nstanze, dmare, pmq, nmq, tipo));
    }

    public void carica() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("chimp.txt")));
            String s = br.readLine();
            while (s != null) {
                int num = Integer.parseInt(s);
                s = br.readLine();
                double uno = Double.parseDouble(s);
                s = br.readLine();
                double dos = Double.parseDouble(s);
                s = br.readLine();
                double tres = Double.parseDouble(s);
                s = br.readLine();
                String str = s;
                agg(num, uno, dos, tres, str);
                s = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public void salva() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(new File("chimp.txt")));
            for (int i = 0; i < elenco.size(); i++) {
                appartamenti app = elenco.get(i);
                pw.println(app.getNstanze());
                pw.println(app.getdmare());
                pw.println(app.getpmq());
                pw.println(app.getnmq());
                pw.println(app.gettipo());
            }
            pw.flush();
            pw.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void otto() {
        for (appartamenti app : elenco) {
            if (app.getdmare() < 8000)
                System.out.println(app.toString());
        }
    }

    public void stampa() {
        for (appartamenti app : elenco) {
            System.out.println(app.toString());
        }
    }
}