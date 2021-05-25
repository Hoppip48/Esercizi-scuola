package AOggetti.Contatti;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
    Contatto c = new Contatto();
    List<Contatto> r = new ArrayList<Contatto>();
    int contatore = 0;

    public void aggiungiContatto() {
        r.add(c);
        contatore++;
    }

    public void rimuoviContatto() {
        if (contatore > 0) {
            r.remove(contatore);
            contatore--;
        }
    }

    public void cercaContatto() {
        // non mi viene in mente oggi
    }
}