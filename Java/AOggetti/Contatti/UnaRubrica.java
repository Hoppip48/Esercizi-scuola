package AOggetti.Contatti;

import java.util.Scanner;

public class UnaRubrica {
    public static void main(String[] args) {
        Scanner ts = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        String scelta = "";
        Boolean sclt = false;
        Rubrica r = new Rubrica();
        do {
            System.out.print("1) Aggiungi contatto \n" + "2) rimuovi contatto \n " + "3) cerca contatto dal nome \n "
                    + "4) stampa tutta la rubrica \n " + "x) chiudi \n");
            System.out.print("Inserisci numero: ");
            scelta = ts.nextLine();
            if (scelta.equals("1"))
                r.aggiungiContatto();
            else if (scelta.equals("2"))
                r.rimuoviContatto();
            else if (scelta.equals("3"))
                r.cercaContatto();
            else if (scelta.equals("4"))
                r.toString();
            else if (scelta.equals("x"))
                sclt = true;
        } while (sclt == false);
        ts.close();
        t.close();
    }
}