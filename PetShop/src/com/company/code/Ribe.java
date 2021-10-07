package com.company.code;

public class Ribe extends Zivotinje {
    double temperatura;
    boolean slanaVoda;
    String vrstaRibe;

    public Ribe(int godine,  String ishrana, double cena, boolean slanaVoda,String vrstaRibe){

       this.godine = godine;
       this.cena = cena;
       this.ishrana = ishrana;
       this.slanaVoda = slanaVoda;
       this.vrstaRibe = vrstaRibe;

    }
    @Override
    public void oglasavanje(){

        System.out.println(this.vrstaRibe + " je napravila Gurlp");
    }
}
