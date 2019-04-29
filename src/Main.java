import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Subjekt blåt = new Subjekt();

        Subjekt rødt = new Subjekt();

        Badegæst Nik = new Badegæst(blåt, "Nikolaj");
        Badegæst jan = new Badegæst(blåt, "Jan");
        Badegæst lars = new Badegæst(blåt, "Lars");
        Badegæst john = new Badegæst(blåt, "John");

        Badegæst igor = new Badegæst(rødt, "Igor");
        Badegæst stalin = new Badegæst(rødt, "Stalin");
        Badegæst rasputin = new Badegæst(rødt, "Rasputin");
        Badegæst torben = new Badegæst(rødt, "Torben");


        blåt.setBesked("badetiden er slut nu");

        rødt.setBesked("så kan du godt komme op af børnebassinet");

        List<Observatør> abonnenter = new ArrayList<>();

        abonnenter.add(Nik);
        abonnenter.add(jan);
        abonnenter.add(john);
        abonnenter.add(lars);
        abonnenter.add(igor);
        abonnenter.add(stalin);
        abonnenter.add(rasputin);
        abonnenter.add(torben);

        udskrivListe(abonnenter);


        Subjekt reuters = new Subjekt();

        Avis EB = new Avis(reuters,"Ekstrabladet");
        Avis BT = new Avis(reuters,"Berlingsketidne");

        reuters.setBesked("mand bidder hund");

        abonnenter.add(EB);
        abonnenter.add(BT);


        System.out.println("\n\n\n\n\n\n");

        System.out.println("det samlede antal er " + Subjekt.getAntal());

        System.out.println("det samlede antal blå er " + blåt.getTypeAntal());



    }

    public static void udskrivListe(List<Observatør> observatørs){

        for (Observatør observatør : observatørs) {
            System.out.println(((Badegæst) observatør).getNavn());

        }
    }


}
