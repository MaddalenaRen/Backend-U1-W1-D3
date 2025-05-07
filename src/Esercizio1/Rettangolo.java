package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;



    // Costruttore dentro la classe
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    //metodo area

    public double calcoloArea(){
        return (altezza*larghezza);
    }

    //metodo perimetro

    public double calcoloPerimetro(){
        return 2*(altezza+larghezza);
    }

    public static void  stampaRettangolo (Rettangolo r){
        System.out.println("Area " + r.calcoloArea());
        System.out.println("Perimetro " + r.calcoloPerimetro());

    }


    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo rettangolo:");
        stampaRettangolo(r1);
        System.out.println("Secondo rettangolo:");
        stampaRettangolo(r2);

        System.out.println("Somma Area dei due triangoli " + (r1.calcoloArea() + r2.calcoloArea()));
        System.out.println("Somma Perimetro dei due triangoli " + (r1.calcoloPerimetro()+ r2.calcoloPerimetro()));
    }

    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(6.5, 8.3);
        Rettangolo rettangolo2 = new Rettangolo(4.3,6.7);
        stampaDueRettangoli(rettangolo1,rettangolo2);

    }
}