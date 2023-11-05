package ex1;
import java.util.*;

/**
 * The type Main.
 */
/*Fie interfața Raport care are următoarele metode: generareTitlu(), generareConținut(),
generareIncheiere(). Clasele Articol Științific și Raport Ședință implementează interfață. Un articol
științific conține: in partea de titlu titlul articolului și autorii articolului; in partea de conținut un șir de
secțiuni care au un titlu și un conținut; in partea de încheiere bibliografia folosită în articol. Un raport
de ședință conține în partea de titlu motivul ședinței și data în care a avut loc; în partea de conținut
conține lista subiectelor discutate și un șir de paragrafe cu minuta ședinței; în partea de încheiere șirul
cu peroanele responsabile pentru întocmirea raportului.
Cerințe:
1. Implementați clasele necesare pentru rezolvarea problemei
2. Creați un tablou de rapoarte și afișați conținutul
3. Definiți o metodă care determină numărul de articole din tablou
4. Definiți o metodă care determină data în care s-au desfășurat cele mai multe ședințe. Java
pune la dispoziție clasa Date pentru gestionarea claselor.
5. Documentați proiectul
6. Adăugați teste unitare pentru clasele definite*/
public class Main {
    /**
     * Numar articole int.
     *
     * @param rapoarte - lista de rapoarte                 Metoda returneaza numarul de articole din lista de rapoarte
     * @return numarArticole - numarul de articole din lista de rapoarte
     */
    public static int numarArticole(List<Raport> rapoarte) {
        int numarArticole = 0;
        for (Raport raport : rapoarte) {
            if (raport instanceof ArticolStiintific) {
                numarArticole++;
            }
        }
        return numarArticole;
    }

    /**
     * Data maxima sedinte date.
     *
     * @param rapoarte - lista de rapoarte                 Metoda returneaza data in care s-au desfasurat cele mai multe sedinte
     * @return dataMaxima - data in care s-au desfasurat cele mai multe sedinte
     */
    public static Date dataMaximaSedinte(List<Raport> rapoarte) {
        Map<Date, Integer> frecventaSedinte = new HashMap<>();

        for (Raport raport : rapoarte) {
            if (raport instanceof RaportSedinta) {
                Date dataSedinta = ((RaportSedinta) raport).getDataSedinta();
                frecventaSedinte.put(dataSedinta, frecventaSedinte.getOrDefault(dataSedinta, 0) + 1);
            }
        }

        Date dataMaxima = Collections.max(frecventaSedinte.entrySet(), Map.Entry.comparingByValue()).getKey();

        return dataMaxima;
    }

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        List<Raport> rapoarte = new ArrayList<>();
        rapoarte.add(new ArticolStiintific("Titlu Articol", Arrays.asList("Autor 1", "Autor 2"), Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune")), "Bibliografie"));
        rapoarte.add(new RaportSedinta("Motiv Sedinta", new Date(), Arrays.asList("Subiect 1", "Subiect 2"), Arrays.asList("Minuta 1", "Minuta 2"), Arrays.asList("Persoana 1", "Persoana 2")));
        rapoarte.add(new ArticolStiintific("Titlu Articol 2", Arrays.asList("Autor 1", "Autor 2"), Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune")), "Bibliografie"));
        rapoarte.add(new RaportSedinta("Motiv Sedinta 2", new Date(), Arrays.asList("Subiect 1", "Subiect 2"), Arrays.asList("Minuta 1", "Minuta 2"), Arrays.asList("Persoana 1", "Persoana 2")));
        rapoarte.add(new ArticolStiintific("Titlu Articol 3", Arrays.asList("Autor 1", "Autor 2"), Arrays.asList(new Sectiune("Titlu Sectiune", "Continut Sectiune")), "Bibliografie"));
        rapoarte.add(new RaportSedinta("Motiv Sedinta 3", new Date(), Arrays.asList("Subiect 1", "Subiect 2"), Arrays.asList("Minuta 1", "Minuta 2"), Arrays.asList("Persoana 1", "Persoana 2")));
        int x = numarArticole(rapoarte);
       System.out.println(x);
        Date dataMaxima = dataMaximaSedinte(rapoarte);
        System.out.println(dataMaxima);
    }
}
