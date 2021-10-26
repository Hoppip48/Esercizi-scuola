
package AOggetti.BicicletteMorgigno;

public class Bicicletta {
    private String marca;
    private String modello;
    private double prezzo;

    public Bicicletta() {
    }

    public Bicicletta(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return this.modello;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public void applicaSconto(int per100) {
        prezzo = prezzo - (prezzo * per100) / 100;
    }

    public String Stampante() {
        return "Marca: " + marca + "\nmodello: " + modello + "\nprezzo: " + prezzo;
    }
}
