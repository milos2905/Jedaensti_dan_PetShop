package com.company.code;

public class Zaposleni extends Osobe{

    String ime;
    String prezime;
    public Zaposleni(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;

    }

    public void izdatiRacun(Kupac kupac) {
        System.out.println("Prodavac " + ime + "  " + prezime + " je izdao racun na iznos " + kupac.korpa.ukupanIznos + " nacin placanja " + kupac.nacinPlacanja);
        if (kupac.nacinPlacanja == null) {
            System.out.println("Molim Vas, izaberite jedan od nacina placanja!");
        } else {
            if (kupac.nacinPlacanja.equals("kes")) {
               // kupac.korpa.ukupanIznos = kupac.korpa.ukupanIznos * 0.8;
                System.out.println("Vas racun je " + kupac.korpa.ukupanIznos * 0.8 + " dinara. ");
            } else {
                if (kupac.nacinPlacanja.equals("BancaIntesa")){
                  //  kupac.korpa.ukupanIznos = kupac.korpa.ukupanIznos * 0.9;
                    System.out.println("Imate popust od 10%. Vas racun je " + kupac.korpa.ukupanIznos * 0.9 + " dinara.");
                }

            }
        }
       // kupac.korpa = new Korpa();
    }

}
