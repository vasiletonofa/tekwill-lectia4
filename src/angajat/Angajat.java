package angajat;

import enumerare.Valuta;
import person.*;

public class Angajat extends Person {

    public static int count;

    private int salariu; // 0

    private Valuta valuta;

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int value) {
        count = value;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }
}
