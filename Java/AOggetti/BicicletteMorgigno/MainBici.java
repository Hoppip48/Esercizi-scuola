
package AOggetti.BicicletteMorgigno;

import java.util.Scanner;

public class MainBici {

    public static void main(String[] args) {
        String marca;
        String modello;
        double prezzo;
        int per100;
        Scanner t = new Scanner(System.in);
        Scanner ts = new Scanner(System.in);
        NegozioBiciclette NB = new NegozioBiciclette();
        ListaBiciclette LB = new ListaBiciclette();
        while (true) {
            int scelta = NB.lista();
            if (scelta == 0)
                break;
            else if (scelta == 1) {
                System.out.print("Ins marca: ");
                marca = ts.nextLine();
                System.out.print("Ins modello: ");
                modello = ts.nextLine();
                System.out.print("Ins prezzo: ");
                prezzo = t.nextDouble();
                LB.aggiungiBici(new Bicicletta(marca, modello, prezzo));
            } else if (scelta == 2) {
                System.out.print("Ins marca: ");
                marca = ts.nextLine();
                System.out.print("Ins modello: ");
                modello = ts.nextLine();
                LB.cancellaBici(marca, modello);
            } else if (scelta == 3) {
                System.out.print("Ins marca: ");
                marca = ts.nextLine();
                System.out.print("Ins modello: ");
                modello = ts.nextLine();
                System.out.print("Ins sconto: ");
                per100 = t.nextInt();
                LB.scontaBici(marca, modello, per100);
            } else if (scelta == 4) {
                System.out.print("Ins marca: ");
                marca = ts.nextLine();
                LB.cercaBici(marca);
            } else if (scelta == 5) {
                LB.stampaBici();
            }
            ts.close();
            t.close();

        }
    }

}
