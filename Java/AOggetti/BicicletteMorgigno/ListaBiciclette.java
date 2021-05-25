
package AOggetti.BicicletteMorgigno;

import java.util.ArrayList;
import java.util.List;

public class ListaBiciclette {
    List<Bicicletta> bicilist = new ArrayList<Bicicletta>();

    public void aggiungiBici(Bicicletta b) {
        bicilist.add(b);
    }

    public void cancellaBici(String marca, String modello) {
        for (int i = 0; i < bicilist.size(); i++) {
            if (marca.equals(bicilist.get(i).getMarca()) && modello.equals(bicilist.get(i).getModello())) {
                bicilist.remove(i);
            }
        }
    }

    public void scontaBici(String marca, String modello, int per100) {
        for (Bicicletta b : bicilist) {
            if (marca.equals(b.getMarca()) && modello.equals(b.getModello())) {
                b.applicaSconto(per100);
            }
        }
    }

    public void cercaBici(String marca) {
        for (Bicicletta b : bicilist) {
            if (marca.equals(b.getMarca())) {
                System.out.println("Modello: " + b.getModello() + "\nPrezzo" + b.getPrezzo());
            }
        }
    }

    public void stampaBici() {
        Bicicletta B = new Bicicletta();
        System.out.print(B.Stampante());
    }
}
