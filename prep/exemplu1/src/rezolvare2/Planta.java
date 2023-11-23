package rezolvare2;

public class Planta {
    private double pret;
    private String nume;
    private boolean isCarnivora;

    public Planta() {
        this.pret = 0;
        this.nume = "";
        this.isCarnivora = false;
    }

    public Planta(double pret, String nume, boolean isCarnivora) {
        this.pret = pret;
        this.nume = nume;
        this.isCarnivora = isCarnivora;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "pret=" + pret +
                ", nume='" + nume + '\'' +
                ", isCarnivora=" + isCarnivora +
                '}';
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isCarnivora() {
        return isCarnivora;
    }

    public void setCarnivora(boolean carnivora) {
        isCarnivora = carnivora;
    }
}
