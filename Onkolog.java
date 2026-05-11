package Test_OOP_11_05;

import java.util.ArrayList;

public class Onkolog extends Doktor{
    public Onkolog(ArrayList<Pacijent> pacijenti, String ime, int godiste) {
        super(pacijenti, ime, godiste);
    }

    //I izbacuje sve pacijente koji imaju 18 i manje godina

    @Override
    public void izbaci(){
        for (int i = getPacijenti().size() - 1; i>=0; i--){
            if (getPacijenti().get(i).brojGodina() <= 18){
                getPacijenti().remove(i);
            }
        }

    }
}
