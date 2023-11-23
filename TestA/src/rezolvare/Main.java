package rezolvare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void afisareFarmacii(ArrayList<Farmacie> farmacii){
        for(Farmacie farmacie : farmacii){
            System.out.println(farmacie);
        }
    }
    public static void sortareFarmacii(ArrayList<Farmacie> farmacii){
        farmacii.sort(Comparator.comparing(Farmacie::getNume));
        afisareFarmacii(farmacii);
    }
    public static void afisareStocDeschis(ArrayList<Farmacie> farmacii){
        for(Farmacie farmacie : farmacii){
            if(farmacie.isEsteDeschisa()==true && farmacie.countMedicamenteDiferite()>=4){
                System.out.println(farmacie);
            }
        }
    }
    public static void afisareNrTotalInStoc(ArrayList<Farmacie> farmacii){
        HashMap<String, Integer> stocFarmacii = new HashMap<>();
        for(Farmacie farmacie : farmacii){
            stocFarmacii.put(farmacie.getNume(), farmacie.countMedicamenteTotal());
        }
        System.out.println(stocFarmacii);
    }
    public static void main(String[] args) {
        Medicament ibuprofen = new Medicament(30, 10,"ibuprofen");
//        System.out.println(ibuprofen);
        Medicament aspirin = new Medicament(20, 5,"aspirin");
        Medicament validol = new Medicament(500, 1,"validol");
        Medicament tramadol = new Medicament(300,400,"tramadol");
        Medicament otilin = new Medicament(20,10,"otilin");
        Medicament septolete = new Medicament(100,70,"septolete");
        ArrayList<Medicament> medicamenteCatena = new ArrayList<>();
        ArrayList<Medicament> medicamenteDrMax = new ArrayList<>();
        medicamenteCatena.add(ibuprofen);
        medicamenteCatena.add(aspirin);
        medicamenteCatena.add(validol);
        medicamenteDrMax.add(tramadol);
        medicamenteDrMax.add(otilin);
        medicamenteDrMax.add(septolete);
        medicamenteDrMax.add(ibuprofen);
        Farmacie Catena = new Farmacie("Catena", true, medicamenteCatena);
//        System.out.println(Catena);
        Farmacie DrMax = new Farmacie("Dr Max", true,medicamenteDrMax);
        ArrayList<Farmacie> farmacii = new ArrayList<>();
        farmacii.add(Catena);
        farmacii.add(DrMax);
//        afisareFarmacii(farmacii);
//        sortareFarmacii(farmacii);
//        afisareStocDeschis(farmacii);
        afisareNrTotalInStoc(farmacii);
    }
}
