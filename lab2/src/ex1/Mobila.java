package ex1;

public class Mobila {
    private String nume = "necunoscut";
    private String descriere = "necunoscut";
    private String material = "necunoscut";
    private int[] dimensiuni = new int[3];
    private double pret = 0.1;

    @Override
    public String toString() {
        return "Mobila{" +
                "nume='" + nume + '\'' +
                ", descriere='" + descriere + '\'' +
                ", material='" + material + '\'' +
                ", dimensiuni=" + dimensiuni[0] + "x" + dimensiuni[1] + "x" + dimensiuni[2] +
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
    public void setDimensiuni(int[] dimensiuni){
        this.dimensiuni = dimensiuni;
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
        return dimensiuni;
    }



}
