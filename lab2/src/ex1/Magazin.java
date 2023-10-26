package ex1;
/**
 * Clasa care reprezintă un magazin de mobilier care are un nume, o adresă și conține un tablou de Mobile.
 */
public class Magazin {
    private String nume;
    private String adresa;
    private Mobila[] mobilier;
    private int nrMobilier;
    /**
     * Constructorul implicit pentru Magazin.
     */
    public Magazin(){
        this.nume = "necunoscut";
        this.adresa = "necunoscut";
    }
    /**
     * Constructor pentru Magazin cu detalii specifice.
     *
     * @param nume         Numele magazinului.
     * @param adresa       Adresa magazinului.
     * @param MAX_MOBILIER Numărul maxim de piese de mobilier pe care magazinul le poate deține.
     */
    public Magazin(String nume, String adresa, int MAX_MOBILIER){
        this.nume = nume;
        this.adresa = adresa;
        this.mobilier = new Mobila[MAX_MOBILIER];
        this.nrMobilier = 0;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Magazin { ");
        builder.append("nume='").append(nume).append('\'');
        builder.append(" , adresa='").append(adresa).append('\'');
        builder.append(" , mobilier={");
        for (int i = 0; i < nrMobilier; i++) {
            builder.append(mobilier[i]);
            if (i < nrMobilier - 1) {
                builder.append(", ");
            }
        }
        builder.append("}");
        builder.append("}");
        return builder.toString();
    }//m-am complicat prea mult cu toString-ul ngl

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
    public Magazin(String nume, String adresa){
        this.nume = nume;
        this.adresa = adresa;
    }
    /**
     * Adaugă o piesă de mobilier în magazin.
     *
     * @param mobila Piesa de mobilier de adăugat.
     */
    public void adaugaMobila(Mobila mobila){
        if(nrMobilier < mobilier.length){
            mobilier[nrMobilier] = mobila;
            nrMobilier++;
        }
        else{
            System.out.println("Nu mai este loc in magazin");
        }
    }
    //gasim minimul dintr-un vector de mobila
    public double minim(){
        double minim = mobilier[0].getPret();
        for(int i = 1; i < nrMobilier; i++){
            if(mobilier[i].getPret() < minim){
                minim = mobilier[i].getPret();
            }
        }
        return minim;
    }
}
