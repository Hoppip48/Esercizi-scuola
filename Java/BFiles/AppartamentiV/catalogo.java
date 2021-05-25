package BFiles.AppartamentiV;

import java.util.*;

public class catalogo {

    public static void main(String[] args) {
        immobili imm = new immobili();
        Scanner t = new Scanner(System.in);
        Scanner ts = new Scanner(System.in);
        int sclt;
        while (true) {
            System.out.println(
                    "" + "\n1) agg" + "\n2) sout" + "\n3) sout<8" + "\n4) salva" + "\n5) carica" + "\n0) esci");
            sclt = t.nextInt();
            if (sclt == 0)
                break;
            else if (sclt == 1) {
                System.out.println("ins stanze, dist mare, prezzo mq, num mq, tipo");
                imm.agg(t.nextInt(), t.nextDouble(), t.nextDouble(), t.nextDouble(), ts.nextLine());
            } else if (sclt == 2)
                imm.stampa();

            else if (sclt == 3)
                imm.otto();

            else if (sclt == 4)
                imm.salva();

            else if (sclt == 5)
                imm.carica();
        }
        t.close();
        ts.close();
    }
}
