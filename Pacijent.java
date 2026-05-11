package Test_OOP_11_05;

public class Pacijent {
    private String ime;
    private int godinaRodjenja;

    //konstruktor

    public Pacijent(int godinaRodjenja, String ime) {
        this.godinaRodjenja = godinaRodjenja;
        this.ime = ime;
    }

    //Getteri i setteri

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    //toString

    @Override
    public String toString() {
        return "Pacijent{" +
                "ime='" + ime + '\'' +
                ", godinaRodjenja=" + godinaRodjenja +
                '}';
    }

    //metoda
    //int brojGodina() - vraca koliko pacijent ima godina

    public int brojGodina(){
        return 2026 - getGodinaRodjenja();
    }
}
