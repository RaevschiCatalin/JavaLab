package ex1;
/*Creați o clasă grădină zoologică care are următoarele caracteristici: un nume și o listă de
animale. Din clasa Animal derivă clasele Elefant, Tigru, Leu, Flamingo și Struț pentru care se
adaugă atribute specifice. Grădina zoologică gestionează stocul de hrană necesar pentru
animale. Adăugați atribute claselor pentru a oferi utilizatorului următoarele facilități:
a. Generare de rapoarte pentru a determina necesarul de hrană perzi / luna / tip animal
b. Obținerea listei de animale de același tip deținute de grădina zoologică. Implementați
cerința folosind o metodă generică.
Cerințe design aplicație
a. Creați diagrama de clase pentru soluția propusă și identificați relațiile dintre clase.
b. Documentați codul proiectului.
c. Adăugați teste unitare pentru metodele definite.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Zoo gradinaZoologica = new Zoo("Gradina Zoologica Oradea");

        gradinaZoologica.adaugaAnimal(new Elefant("Elefant1", 2.5));
        gradinaZoologica.adaugaAnimal(new Tigru("Tigru1", 4));
        gradinaZoologica.adaugaAnimal(new Leu("Leu1", "Maro"));
        gradinaZoologica.adaugaAnimal(new Flamingo("Flamingo1", "Roz"));
        gradinaZoologica.adaugaAnimal(new Strut("Strut1", 1.8));

        System.out.println("Raportul de hrana per luna:");
        Map<String, Integer> raportHrana = gradinaZoologica.raportHranaPerLuna();
        for (Map.Entry<String, Integer> entry : raportHrana.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " bucăți");
        }

        System.out.println("\nAnimalele de tip Tigru din gradina zoologica:");
        List<Tigru> tigri = gradinaZoologica.animaleDeTip(Tigru.class);
        for (Tigru tigru : tigri) {
            System.out.println(tigru.getNume());
        }
    }
}