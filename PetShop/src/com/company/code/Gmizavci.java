package com.company.code;

public class Gmizavci extends Zivotinje{

    double temperatura;
    String vrstaGmizavca;

    public Gmizavci(int godine,String ishrana, double cena, double temperatura, String vrstaGmizavca){
        super(godine, cena, ishrana);
        this.temperatura = temperatura;
        this.vrstaGmizavca = vrstaGmizavca;
    }

    @Override
    public void oglasavanje(){

        System.out.println(this.vrstaGmizavca + " shisti");
    }
}
