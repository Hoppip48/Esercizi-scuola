package BFiles.Backup;

import java.io.*;

public class backup {

    public static void main(String[] args) throws IOException {
        FileInputStream leggi;
        FileOutputStream scrivi;
        int n;
        String pos = "C://Users//franc//OneDrive//Immagini//Saved Pictures//ez.png";
        String pos2 = "C://Users//franc//OneDrive//Immagini//Saved Pictures//oz.png";
        File fsrc = new File(pos);
        File fdst = new File(pos2);
        byte[] asd = new byte[4096];
        try {
            leggi = new FileInputStream(fsrc);
            scrivi = new FileOutputStream(fdst);
            n = leggi.read(asd);
            while (n != -1) {
                scrivi.write(asd);
                n = leggi.read(asd);
            }
            scrivi.flush();
            leggi.close();
            scrivi.close();
        } catch (FileNotFoundException ex) {
            System.out.println("errore: " + ex);
        }

    }
}
