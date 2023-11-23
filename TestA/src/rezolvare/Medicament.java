package rezolvare;

public class Medicament {
    private int cantitate;
    private double pret;
    private String nume;

    public Medicament() {
        this.cantitate = 0;
        this.pret = 0;
        this.nume = "";
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "cantitate=" + cantitate +
                ", pret=" + pret +
                ", nume='" + nume + '\'' +
                '}';
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
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

    public Medicament(int cantitate, double pret, String nume) {
        this.cantitate = cantitate;
        this.pret = pret;
        this.nume = nume;
    }
}
