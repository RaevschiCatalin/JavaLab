package rezolvare2;

public class Pom extends Planta{
    private int dimensiuneaCoroanei;

    public Pom() {
        super();
        this.dimensiuneaCoroanei = 0;
    }
    public Pom(double pret, String nume, boolean isCarnivora, int dimensiuneaCoroanei) {
        super(pret, nume, isCarnivora);
        this.dimensiuneaCoroanei = dimensiuneaCoroanei;
    }

    @Override
    public String toString() {
        return "Pom{" +
                "dimensiuneaCoroanei=" + dimensiuneaCoroanei +
                "} " + super.toString();
    }

    public int getDimensiuneaCoroanei() {
        return dimensiuneaCoroanei;
    }

    public void setDimensiuneaCoroanei(int dimensiuneaCoroanei) {
        this.dimensiuneaCoroanei = dimensiuneaCoroanei;
    }
}
