package com.company.code;

public class Main {

    public static void main(String[] args) {
        Zaposleni zaposleni1 = new Zaposleni("Natasa", "Stokic");
        Zaposleni zaposleni2 = new Zaposleni("Nikola", "Smiljanic");
        Zaposleni zaposleni3 = new Zaposleni("Marko", "Cvijovic");

        HranaZaGmizavce insekti1 = new HranaZaGmizavce(349.99,1.5);
        HranaZaGmizavce insekti2 = new HranaZaGmizavce(649.99,3.0);
        HranaZaRibe ribice1 = new HranaZaRibe(399.99,0.2);
        HranaZaRibe ribice2 = new HranaZaRibe(799.99,0.5);
        HranaZaSisare Granule1 = new HranaZaSisare(439.99,2.0);
        HranaZaSisare Granule2 = new HranaZaSisare(999.99,5.0);
        HranaZaSisare Granule3 = new HranaZaSisare(1799.99,10.0);

        Sisari pas = new Sisari(4, "granule", 19999.99, "Pas");
        Sisari macka = new Sisari(3, "granule", 9999.99, "Macka");
        Sisari hrcak = new Sisari(2, "hranaZaSisare", 999.99, "Hrcak");

        Ribe borac = new Ribe(1, "HranaZaRibice", 499.99, false, "Borac");
        Ribe skalari = new Ribe(1, "HranaZaRibice", 799.99, true, "Skalar");
        Ribe cistac = new Ribe(1, "HranaZaRibice", 599.99, false, "Cistac");

        Gmizavci kornjaca = new Gmizavci(2, "hranaZaGmizavce", 1299.99, 26, "kornjaca");
        Gmizavci iguana = new Gmizavci(5, "hranaZaGmizavce", 13999.99, 36,"iguana");
        Gmizavci aligator = new Gmizavci(3, "hranaZaGmizavce", 49999.99, 33, "aligator");

        Kupac milosPetrovic = new Kupac();
        Kupac aleksandraTomic = new Kupac();

        Zivotinje[] izabraneZivotinje = {pas, borac, iguana};
        Hrana[] izabranaHrana = {Granule1, ribice1, insekti2};

        Zivotinje[] miloseviLjubimci = {aligator};
        Hrana[] hranaZaMiloseveLjubimce = {ribice1, ribice2};

        pas.zivotinjaNaAkciji(true);
        pas.zivotinjaNaAkciji(false);


        aleksandraTomic.ubaciUKorpuHranu(izabranaHrana);
        aleksandraTomic.ubaciUKorpuZivotinje(izabraneZivotinje);
        aleksandraTomic.nacinPlacanja = "kes";

//        milosPetrovic.ubaciUKorpuHranu(hranaZaMiloseveLjubimce);
//        milosPetrovic.ubaciUKorpuZivotinje(miloseviLjubimci);
//        milosPetrovic.nacinPlacanja = "BancaIntesa";


        zaposleni1.izdatiRacun(aleksandraTomic);
       // zaposleni1.izdatiRacun(milosPetrovic);

        aleksandraTomic.ubaciUKorpuZivotinje(miloseviLjubimci);
        zaposleni1.izdatiRacun(aleksandraTomic);

    }
}
