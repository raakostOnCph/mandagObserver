public class Avis extends Observatør {

    String navn;

    public Avis(Subjekt subjekt ,String navn) {
        this.navn = navn;
        this.subjekt = subjekt;
        subjekt.abonner(this);
    }

    @Override
    public void update() {

        System.out.println("sket i ugen: "  + subjekt.getBesked().toUpperCase());

    }
}
