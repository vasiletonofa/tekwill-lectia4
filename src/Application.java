import angajat.Angajat;
import enumerare.Language;
import enumerare.Valuta;

public class Application {

    public static void main(String[] args) {
        Angajat angajat = new Angajat();
        angajat.setSalariu(1234);
        angajat.setCount(6);

        angajat.setLanguage(Language.RU);

        angajat.setValuta(Valuta.EUR);

        System.out.println(angajat.getLanguage());
        System.out.println(angajat.getValuta());
    }
}
