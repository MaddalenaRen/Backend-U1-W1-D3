package Esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzoArticolo;
    private int numeroArticoliDisponibili;

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public int getNumeroArticoliDisponibili() {
        return numeroArticoliDisponibili;
    }

    public Articolo (String codiceArticolo, String descrizioneArticolo, double prezzoArticolo, int numeroArticoliDisponibili){
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo=descrizioneArticolo;
        this.prezzoArticolo=prezzoArticolo;
        this.numeroArticoliDisponibili=numeroArticoliDisponibili;


    }
}

