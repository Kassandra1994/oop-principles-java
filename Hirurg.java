package Test_OOP_11_05;

import java.util.ArrayList;

public class Hirurg extends Doktor{
    public Hirurg(ArrayList<Pacijent> pacijenti, String ime, int godiste) {
        super(pacijenti, ime, godiste);
    }

    //I on ne izbacuje pacijente iz liste
    @Override
    public void izbaci(){
        //prazno?
    }
}
