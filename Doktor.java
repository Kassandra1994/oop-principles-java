package Test_OOP_11_05;

import java.util.ArrayList;

public class Doktor {
    private ArrayList<Pacijent> pacijenti;
    private String ime;
    private int godiste;

    //konstruktor

    public Doktor(ArrayList<Pacijent> pacijenti, String ime, int godiste) {
        this.pacijenti = pacijenti;
        this.ime = ime;
        this.godiste = godiste;
    }

    //getteri i setteri


    public ArrayList<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public void setPacijenti(ArrayList<Pacijent> pacijenti) {
        this.pacijenti = pacijenti;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    //toString

    @Override
    public String toString() {
        return "Doktor{" +
                "pacijenti=" + pacijenti +
                ", ime='" + ime + '\'' +
                ", godiste=" + godiste +
                '}';
    }

    //METODE

    //int zarada() - vraca zaradu doktora ako racunamo da zaradjuje 100 po pacijentu
    public int zarada(){
        return getPacijenti().size()*100;
    }

    // boolean potrazi(Pacijent p) - za prosledjenog pacijenata vraca true ako je u listi

    public boolean potrazi(Pacijent p){
        for (Pacijent element : getPacijenti()){
            if (element.getIme().equals(p.getIme()) && element.getGodinaRodjenja() == p.getGodinaRodjenja()){
                return true;
            }
        }
        return false;
    }

    //void izbaci() - izbacuje pacijenta iz liste

    public void izbaci(){
        for (int i = getPacijenti().size() - 1; i>=0; i--){
            if (getPacijenti().get(i).brojGodina() < 18){
                getPacijenti().remove(i);
            }
        }
    }

    //najmladji() - ispisuje najmladjeg pacijenta iz liste

    public void najmladji(){
        try {
            Pacijent mladji = getPacijenti().get(0);
            for (Pacijent p : getPacijenti()){
                if (p.brojGodina() < mladji.brojGodina()){
                    mladji = p;
                }
            }
            System.out.println("Najmladji pacijent je " + mladji);
        }catch (Exception e){
            System.out.println("Greska!");
        }
    }
}
