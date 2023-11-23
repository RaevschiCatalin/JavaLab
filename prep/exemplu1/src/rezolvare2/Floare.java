package rezolvare2;

public class Floare extends Planta{
    private String perioadaDeInflorire;

    public Floare() {
        super();
        this.perioadaDeInflorire = "";
    }

    public Floare(double pret, String nume, boolean isCarnivora, String perioadaDeInflorire) {
        super(pret, nume, isCarnivora);
        this.perioadaDeInflorire = perioadaDeInflorire;
    }

    @Override
    public String toString() {
        return "Floare{" +
                "perioadaDeInflorire='" + perioadaDeInflorire + '\'' +
                "} " + super.toString();
    }

    public String getPerioadaDeInflorire() {
        return perioadaDeInflorire;
    }

    public void setPerioadaDeInflorire(String perioadaDeInflorire) {
        this.perioadaDeInflorire = perioadaDeInflorire;
    }
}
