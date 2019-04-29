public class Badegæst extends Observatør {

    private String navn;

    public Badegæst(Subjekt subjekt, String navn) {
        this.navn = navn;
        this.subjekt = subjekt;
        subjekt.abonner(this);
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public void update() {
        System.out.println(navn + " " + subjekt.getBesked());

    }
}
