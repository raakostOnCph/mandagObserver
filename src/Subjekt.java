import java.util.ArrayList;
import java.util.List;

public class Subjekt {

    private static int antal=0;

    private int typeAntal=0;

    private String besked;

    List<Observatør> observatørList = new ArrayList<>();

    public String getBesked() {
        return besked;
    }

    public void setBesked(String besked) {
        this.besked = besked;
        // her skal vi lige advisere alle vores abonnenter


//        if(besked.equals("badtid er slut" )) {
            adviserAbonnenter();
//        }
    }

    private void adviserAbonnenter() {

        for (Observatør observatør : observatørList) {

            observatør.update();

        }

    }

    public static int getAntal() {
        return antal;
    }

    public int getTypeAntal() {
        return typeAntal;
    }

    public void abonner(Observatør observatør) {

        observatørList.add(observatør);
        antal++;
        typeAntal++;


    }
}
