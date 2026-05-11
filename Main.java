package Test_OOP_11_05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        OOP Test:

Napraviti klasu pacijent koji od atributa ima ime I godiste rodjenja. Napraviti metodu:
-int brojGodina() - vraca koliko pacijent ima godina

Napraviti klasu Doktor Koji od atributa ima listu pacijenata, ime i godiste. Napraviti metode:
- int zarada() - vraca zaradu doktora ako racunamo da zaradjuje 100 po pacijentu
- boolean potrazi(Pacijent p) - za prosledjenog pacijenata vraca true ako je u listi
- void izbaci() - izbacuje pacijenta iz liste
- najmladji() - ispisuje najmladjeg pacijenta iz liste

Napraviti klasu Pedijatar Koji nasledjuje klasu Doktor I on izbacuje sve pacijente koji imaju vise od 18 godina
Napraviti klasu Onkolog Koji nasledjuje klasu Doktor I izbacuje sve pacijente koji imaju 18 i manje godina
Napraviti klasu Hirurg Koji nasledjuje klasu Doktor I on ne izbacuje pacijente iz liste

Napraviti interface KlinikaFinansije koja ima metodu:
-int klinikaZarada() - vraca kolika je ukupna zarada svih doktora iz te klinike

Napraviti klasu Klinika koja od atributa ima listu doktora I implementira interface KlinikaFinansije. Takodje ima metodu:
-void sviPedijatri() - stampa sve pedijatre iz liste // Dodatni zadatak
*Upotrebiti try catch blok u jednoj proizvoljnoj metodi
         */


        Pacijent p1 = new Pacijent(1996, "Milos");
        Pacijent p2 = new Pacijent(1987, "Jelena");
        Pacijent p3 = new Pacijent(2016, "Uros");
        Pacijent p4 = new Pacijent(2000, "Milica");

        ArrayList<Pacijent>listaZaPedijatra = new ArrayList<>();
        listaZaPedijatra.add(p1);
        listaZaPedijatra.add(p2);
        listaZaPedijatra.add(p3);
        listaZaPedijatra.add(p4);

        ArrayList<Pacijent>listaZaOnkologa = new ArrayList<>();
        listaZaOnkologa.add(p1);
        listaZaOnkologa.add(p2);
        listaZaOnkologa.add(p3);
        listaZaOnkologa.add(p4);

        ArrayList<Pacijent>listaZaHirurga = new ArrayList<>();
        listaZaHirurga.add(p1);
        listaZaHirurga.add(p2);
        listaZaHirurga.add(p3);
        listaZaHirurga.add(p4);

        Pedijatar pedijatar = new Pedijatar(listaZaPedijatra, "Dr Tatic", 1990);
        Pedijatar pedijatar1 = new Pedijatar(listaZaPedijatra, "Dr Lakic", 1986);
        Onkolog onkolog = new Onkolog(listaZaOnkologa,"Dr Simic", 1967);
        Onkolog onkolog1 = new Onkolog(listaZaOnkologa,"Dr Markovic", 1979);
        Hirurg hirurg = new Hirurg(listaZaHirurga,"Dr Grujic", 1986);

        //metode
        pedijatar.izbaci();
        System.out.println("Lista posle izbacivanja ima " + pedijatar.getPacijenti().size() + " pacijenata.");
        pedijatar1.izbaci();
        System.out.println("Lista posle izbacivanja ima " + pedijatar1.getPacijenti().size() + " pacijenata.");
        onkolog1.izbaci();
        System.out.println("Lista posle izbacivanja ima " + onkolog1.getPacijenti().size() + " pacijenata.");
        onkolog.izbaci();
        System.out.println("Lista posle izbacivanja ima " + onkolog.getPacijenti().size() + " pacijenata.");
        hirurg.izbaci();
        System.out.println("Lista posle izbacivanja ima " + hirurg.getPacijenti().size() + " pacijenata.");


        System.out.println("\n Najmladji: ");
        pedijatar.najmladji();
        onkolog.najmladji();
        hirurg.najmladji();

        System.out.println("\n Potrazi pacijenta ");
        System.out.println("Da li je Milos kod onkologa? " + onkolog.potrazi(p1));
        System.out.println("Da li je Jelena kod onkologa? " + onkolog1.potrazi(p2));
        System.out.println("Da li je Jelena kod pedijatra? " + pedijatar1.potrazi(p2));
        System.out.println("Da li je Milica kod pedijatra? " + pedijatar.potrazi(p4));
        System.out.println("Da li je Uros kod hirurga? " + hirurg.potrazi(p3));

        ArrayList<Doktor>sviDokroriUKlinici = new ArrayList<>();
        sviDokroriUKlinici.add(pedijatar1);
        sviDokroriUKlinici.add(pedijatar);
        sviDokroriUKlinici.add(hirurg);
        sviDokroriUKlinici.add(onkolog1);
        sviDokroriUKlinici.add(onkolog);

        Klinika klinika  = new Klinika(sviDokroriUKlinici);
        System.out.println("\n Lista doktora ");
        System.out.println("Svi pedijatri u klinici");
        klinika.sviPedijatri();


        //zaada
        int ukupnaZarada = klinika.klinikaZarada();
        System.out.println("Ukupna zarada klinike: " + ukupnaZarada);



    }
}
