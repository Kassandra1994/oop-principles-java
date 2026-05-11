package Test_OOP_11_05;

import java.util.ArrayList;

public class Klinika implements KlinikaFinansije{
    private ArrayList<Doktor> doktori;

    public Klinika(ArrayList<Doktor> doktori) {
        this.doktori = doktori;
    }

    public ArrayList<Doktor> getDoktori() {
        return doktori;
    }

    public void setDoktori(ArrayList<Doktor> doktori) {
        this.doktori = doktori;
    }

    @Override
    public int klinikaZarada() {
        int ukupno = 0;
        for (Doktor d : getDoktori()){
            ukupno += d.zarada();
        }
        return ukupno;
    }

    public void sviPedijatri(){
        for (Doktor d : getDoktori()){
            if (d instanceof Pedijatar){
                System.out.println("Pedijatar " + d.getIme());
            }
        }
    }

    //Napraviti klasu Klinika koja od atributa ima listu doktora I implementira interface KlinikaFinansije. Takodje ima metodu:
    //-void sviPedijatri() - stampa sve pedijatre iz liste // Dodatni zadatak
}
