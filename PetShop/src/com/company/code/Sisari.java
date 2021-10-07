package com.company.code;

public class Sisari extends Zivotinje{
    String vrstaSisara;
    public Sisari(int godine, String ishrana, double cena, String vrstaSisara) {
        super(godine, cena,ishrana);
        this.vrstaSisara = vrstaSisara;
    }

    @Override
    public void oglasavanje(){

        System.out.println(this.vrstaSisara + " je napravio lavez");
    }
}
