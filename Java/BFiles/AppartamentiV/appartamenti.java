package BFiles.AppartamentiV;

public class appartamenti {
    private int nstanze;
    private double dmare;
    private double pmq;
    private double nmq;
    private String tipo;

    public appartamenti() {
    }

    public appartamenti(int nstanze, double dmare, double pmq, double nmq, String tipo) {
        this.nstanze = nstanze;
        this.dmare = dmare;
        this.pmq = pmq;
        this.nmq = nmq;
        this.tipo = tipo;
    }

    public int getNstanze() {
        return nstanze;
    }

    public void setNstanze() {
        // this.nstanze = nstanze;
    }

    public double getdmare() {
        return dmare;
    }

    public void setdmare() {
        // this.dmare = dmare;
    }

    public double getpmq() {
        return pmq;
    }

    public void setpmq() {
        // this.pmq = pmq;
    }

    public double getnmq() {
        return nmq;
    }

    public void setnmq() {
        // this.nmq = nmq;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo() {
        // this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "nstanze:" + nstanze + "\ndmare:" + dmare + "\npmq:" + pmq + "\nnmq:" + nmq + "\ntipo:" + tipo;
    }
}
