package com.company.code;

public class Kupac extends Osobe{
    Korpa korpa = new Korpa();
    String nacinPlacanja;

    public void ubaciUKorpuZivotinje(Zivotinje[] odabraneZivotinje){
        this.korpa.izabraniLjubimac = odabraneZivotinje;
        for (Zivotinje zivotinja:odabraneZivotinje) {
            if (zivotinja.naAkciji){
                zivotinja.cena = zivotinja.cena * 0.9;
            }
            korpa.ukupanIznosZivotinja += zivotinja.cena;
            zivotinja.oglasavanje();
        }
        System.out.println("Ukupna cena zivotinja je: " + korpa.ukupanIznosZivotinja);
        korpa.ukupanIznos += korpa.ukupanIznosZivotinja;
    }

    public void ubaciUKorpuHranu(Hrana[] odabranaHrana){
        this.korpa.izabranaHrana = odabranaHrana;
        for (Hrana hrana:odabranaHrana) {
            korpa.ukupanIznosHrane += hrana.cena;
        }
        System.out.println("Ukupna cena hrane je: " + korpa.ukupanIznosHrane);
        korpa.ukupanIznos += korpa.ukupanIznosHrane;
    }



}
