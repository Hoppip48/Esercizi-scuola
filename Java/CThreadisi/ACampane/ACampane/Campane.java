package ACampane;

public class Campane {
    /*
     * Hello world!
     */
    public static void main(String[] args) {
        // prima modalità di definizione
        Thread suonoCampana1 = new Thread(new TCampane("din", 5));
        Thread suonoCampana2 = new Thread(new TCampane("don", 5));
        Thread suonoCampana3 = new Thread(new TCampane("dan", 5));
        suonoCampana1.start();
        suonoCampana2.start();
        suonoCampana3.start();
        new Thread(new TCampane("dan", 5)).start();

    }
}