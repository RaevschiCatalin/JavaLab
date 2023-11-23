package rezolvare;

import java.util.ArrayList;
import java.util.HashMap;

public class Farmacie {
    private String nume;
    private boolean esteDeschisa;
    ArrayList<Medicament> medicamente;

    public Farmacie() {
        this.nume = "";
        this.esteDeschisa = false;
        this.medicamente = new ArrayList<>();
    }
    public Farmacie(String nume, boolean esteDeschisa, ArrayList<Medicament> medicamente) {
        this.nume = nume;
        this.esteDeschisa = esteDeschisa;
        this.medicamente = medicamente;
    }
    @Override
    public String toString() {
        return "Farmacie{" +
                "nume='" + nume + '\'' +
                ", esteDeschisa=" + esteDeschisa +
                ", medicamente=" + medicamente +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isEsteDeschisa() {
        return esteDeschisa;
    }

    public void setEsteDeschisa(boolean esteDeschisa) {
        this.esteDeschisa = esteDeschisa;
    }

    public ArrayList<Medicament> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(ArrayList<Medicament> medicamente) {
        this.medicamente = medicamente;
    }
    public int countMedicamenteDiferite(){
        HashMap<String, Integer> vectorMedicamente = new HashMap<>();
        int count = 0;
        for(Medicament medicament : medicamente){
            if(vectorMedicamente.containsKey(medicament.getNume())){
                vectorMedicamente.put(medicament.getNume(),vectorMedicamente.get(medicament.getNume())+1);
            }
            vectorMedicamente.put(medicament.getNume(), 1);
        }
        count = vectorMedicamente.size();

        return count;
    }
    public int countMedicamenteTotal(){
        int count = 0;
        for(Medicament medicament : medicamente){
            count += medicament.getCantitate();
        }
        return count;
    }


}
