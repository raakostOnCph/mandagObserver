import java.util.ArrayList;
import java.util.List;

public class Subjekt {


    private String besked;

    List<Observatør> observatørList = new ArrayList<>();

    public String getBesked() {
        return besked;
    }

    public void setBesked(String besked) {
        this.besked = besked;
        // her skal vi lige advisere alle vores abonnenter
        adviserAbonnenter();
    }

    private void adviserAbonnenter() {

        for (Observatør observatør : observatørList) {

            observatør.update();

        }

    }



    public void abonner(Observatør observatør) {

        observatørList.add(observatør);


    }
}
