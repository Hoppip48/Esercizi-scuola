package AOggetti.Contatti;

import java.util.Scanner;

public class Contatto {
    String Nome;
    String Cognome;
    String Numero;

    public Contatto() {
    }

    public Contatto(String Nome, String Cognome, String Numero) {

    }

    public void Inserimento() {
        Scanner ts = new Scanner(System.in);
        System.out.print("\n inserisci nome: ");
        Nome = ts.nextLine();
        System.out.print("\n inserisci cognome: ");
        Cognome = ts.nextLine();
        System.out.print("\n inserisci numero: ");
        Numero = ts.nextLine();
        ts.close();
    }

    public String toString() {
        return "Nome: " + Nome + "\n" + "Cognome: " + Cognome + "\n" + "Numero: " + Numero;
    }
}
