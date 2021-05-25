
package AOggetti.BicicletteMorgigno;

import java.util.Scanner;

public class NegozioBiciclette {
    public int lista() {
        System.out.println("1) Aggiungi Bicicletta \n" + "2) Rimuovi Bicicletta \n" + "3) Sconta Bicicletta \n"
                + "4) Cerca Bicicletta \n" + "5) Stampa ogni bicicletta \n" + "0) esci ");
        Scanner t = new Scanner(System.in);
        System.out.print("Inserisci numero: ");
        int n = t.nextInt();
        t.close();
        return n;
    }

}
