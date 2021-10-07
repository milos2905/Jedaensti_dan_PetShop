package com.company.code;

public class Zivotinje {
    int godine;
    double cena;
    String ishrana;
    boolean naAkciji;

    public Zivotinje(int godine, double cena, String ishrana){
        this.godine = godine;
        this.cena = cena;
        this.ishrana = ishrana;
    }

    public Zivotinje() {
    }

    public void oglasavanje(){
        System.out.println("Oglasavanje zivotinje");
    }

    public void zivotinjaNaAkciji(boolean naAkciji){
        this.naAkciji = naAkciji;
    }
}
