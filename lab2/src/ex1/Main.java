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
        String min = magazine[0].getNume();
        return min;
    }
    public static void main(String[] args) {
        Magazin[] magazine = new Magazin[3];
        magazine[0] = new Magazin("Mobexpert", "Bucuresti");
        magazine[1] = new Magazin("Dedeman", "Cluj");
        magazine[2] = new Magazin("Mobila", "Iasi");
        celMaiIeftin(magazine);
    }

}
