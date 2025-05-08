package Esercizio2;

public class Sim {
    private String numeroSim;
    private double creditoDisponibile;
    private Chiamata[] ultimeChiamate;

    public Sim(String numeroSim) {
        this.numeroSim = numeroSim;
        this.ultimeChiamate = new Chiamata[5];
    }

    public String getNumeroSim() {
        return numeroSim;
    }

    public void setNumeroSim(String numeroSim) {
        this.numeroSim = numeroSim;
    }

    public Chiamata[] getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void setUltimeChiamate(Chiamata[] ultimeChiamate) {
        this.ultimeChiamate = ultimeChiamate;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public void setCreditoDisponibile(double creditoDisponibile) {
        this.creditoDisponibile = creditoDisponibile;
    }

    public String stampa(){
        return "Numero: " + this.numeroSim;

    }
}
