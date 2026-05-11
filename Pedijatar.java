package Test_OOP_11_05;

import java.util.ArrayList;

public class Pedijatar extends Doktor{
    public Pedijatar(ArrayList<Pacijent> pacijenti, String ime, int godiste) {
        super(pacijenti, ime, godiste);
    }

    //I on izbacuje sve pacijente koji imaju vise od 18 godina

    @Override
    public void izbaci(){
        for (int i = getPacijenti().size() - 1; i>=0; i--){
            if (getPacijenti().get(i).brojGodina() > 18){
                getPacijenti().remove(i);
            }
        }

    }
}
