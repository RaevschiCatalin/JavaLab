package ex1;

public class Magazin {
    private String nume = "necunoscut";
    private String adresa = "necunoscut";
    private Mobila[] mobilier = new Mobila[10];

    @Override
    public String toString() {
        return "Magazin{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", mobilier=" + mobilier +
                '}';
    }
    public String getNume(){
        return nume;
    }
    public String getAdresa(){
        return adresa;
    }
    public Mobila[] getMobilier(){
        return mobilier;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setAdresa(String adresa){
        this.adresa = adresa;
    }
    public void setMobilier(Mobila[] mobilier){
        this.mobilier = mobilier;
    }
    public Magazin(String nume, String adresa){
        this.nume = nume;
        this.adresa = adresa;
    }
    public Magazin(){
        this.nume = "necunoscut";
        this.adresa = "necunoscut";
    }
}
