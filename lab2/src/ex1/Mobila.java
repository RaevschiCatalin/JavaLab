package ex1;
/**
 * Clasa care reprezintă o bucată de mobilier cu caracteristici precum nume, descriere, material, dimensiuni și preț.
 */
public class Mobila {
    private String nume;
    private String descriere;
    private String material;
    private int lungime;
    private int latime;
    private int inaltime;
    private double pret;

    /**
     * Constructorul implicit pentru Mobila.
     */
    public Mobila(){
        this.descriere = "necunoscut";
        this.material = "necunoscut";
        this.nume = "necunoscut";
        this.lungime = 0;
        this.latime = 0;
        this.inaltime = 0;
        this.pret = 0;
    }
    /**
     * Constructor pentru Mobila cu detalii specifice.
     *
     * @param nume      Numele piesei de mobilier.
     * @param descriere Descrierea piesei de mobilier.
     * @param material  Materialul din care este confecționată piesa de mobilier.
     * @param lungime   Lungimea piesei de mobilier.
     * @param latime    Lățimea piesei de mobilier.
     * @param inaltime  Înălțimea piesei de mobilier.
     * @param pret      Prețul piesei de mobilier.
     */
    public Mobila(String nume, String descriere, String material, int lungime, int latime, int inaltime, double pret){
        this.nume = nume;
        this.descriere = descriere;
        this.material = material;
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
        this.pret = pret;
    }
    @Override
    public String toString() {
        return "Mobila{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", material='" + material + '\'' +
                ", dimensiuni=" + lungime + "x" + latime + "x" + inaltime +
                ", pret=" + pret +
                '}';
    }
   public double getPret(){
        return pret;
   }
    public String getDescriere(){
         return descriere;
    }
    public void setDescriere(String descriere){
        this.descriere = descriere;
    }
    public void setPret(double pret){
        this.pret = pret;
    }
    public void setDimensiuni(int inaltime, int latime, int lungime){
        this.inaltime = inaltime;
        this.latime = latime;
        this.lungime = lungime;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return nume;
    }
    public String getMaterial(){
        return material;
    }
    public int[] getDimensiuni(){
        return new int[]{inaltime, latime, lungime};
    }

}
