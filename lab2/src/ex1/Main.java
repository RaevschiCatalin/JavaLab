package ex1;
/*Definiți clasa Mobilă care are următoarele caracteristici: nume, descriere, materialul din care
este produsă, dimensiuni (lungime, lățime, înălțime) și preț. Definiți clasa Magazin de mobilă
care are un nume, o adresă și conține un tablou de Mobile.
a. Creați un tablou de magazine de mobile
b. Definiți o metodă care întoarce numele magazinului care conține cele mai ieftine
mobile
c. Definiți o metodă care numără cate mobile conțin o listă de cuvinte în descriere
d. Documentați codul și generați javadoc pentru aceasta
e. Scrieți testele automate pentru metodele definite.*/
public class Main {
    public static String celMaiIeftin(Magazin[] magazine){
        double minim = magazine[0].minim();
        String nume = magazine[0].getNume();
        for(int i = 1; i < magazine.length; i++){
            if(magazine[i].minim() < minim){
                minim = magazine[i].minim();
                nume = magazine[i].getNume();
            }
        }
        return nume;
    }
    public static int numaraCuvinte(Magazin[] magazine, String[] cuvinte) {
        int nr = 0;

        for (int i = 0; i < magazine.length; i++) {
            if (magazine[i].getMobilier() != null) {
                for (int j = 0; j < magazine[i].getMobilier().length; j++) {
                    if (magazine[i].getMobilier()[j] != null) {
                        String descriere = magazine[i].getMobilier()[j].getDescriere();
                        if (descriere != null) {
                            for (int k = 0; k < cuvinte.length; k++) {
                                String cuvant = cuvinte[k].toLowerCase();
                                if (descriere.toLowerCase().contains(cuvant)) {
                                    nr++;
                                }
                            }
                        }
                    }
                }
            }
        }
        //nesting oribil, dar daca nu faci null check-uri, crapa
        return nr;
    }
    public static void main(String[] args) {
        Magazin[] magazine = new Magazin[3];
        magazine[0] = new Magazin("Mobexpert", "Bucuresti", 20);
        magazine[1] = new Magazin("Dedeman", "Cluj", 20);
        magazine[2] = new Magazin("Mobila", "Iasi", 20);
        magazine[0].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[0].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 10));
        magazine[1].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[1].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 40));
        magazine[2].adaugaMobila(new Mobila("Masa", "Masa de bucatarie", "lemn", 100, 50, 70, 200));
        magazine[2].adaugaMobila(new Mobila("Scaun", "Scaun de bucatarie", "lemn", 50, 50, 70, 5));
        System.out.println(celMaiIeftin(magazine));
        String[] cuvinte = {"bucatarie", "scaun"};
        System.out.println(numaraCuvinte(magazine, cuvinte));
    }

}
