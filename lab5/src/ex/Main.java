package ex;

import java.util.*;

/**
 * The type Main.
 */
/*Definiți clasa Film care are ca atribute titlul, regizorul și un buget. Din Film derivați clasa Documentar,
care are ca atribute numărul de episoade și o scurtă descriere a subiectului, și clasa Muzical, care are
ca atribute o listă de actori. Fiecare actor este caracterizat de nume și informații despre abilitățile sale
de dans și de cântat.
a) Creați o listă de filme și afișați lista.
b) Extrageți, din lista de filme, o listă de filme muzicale care au mai puțin de n actori, numărul n este
preluat ca argument din linia de comandă. Folosiți metoda de afișare creată la subpunctul a) pentru a
afișa lista extrasă.
c) Din lista de filme, numărați câte documentare au în descrierea lor un set de cuvinte.
d) Pentru fiecare actor distinct, care apare in lista de filme, afișați titlul filmului și regizorul acestuia.
e) Sortați lista de filme în funcție de buget, iar dacă două filme au același buget sortați în funcție de
regizor.
f) Documentați proiectul.*/
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // a)
        List<Film> listaFilme = creareListaFilme();
        afisareListaFilme(listaFilme);

        // b)
        int n = Integer.parseInt(args[0]);
        List<Film> listaFilmeMuzicale = extrageFilmeMuzicaleCuMaiPutiniActori(listaFilme, n);
        afisareListaFilme(listaFilmeMuzicale);

        // c)
        int numarCuvinte = numaraDocumentareCuCuvinteInDescriere(listaFilme, "documentar", "istorie");
        System.out.println("Numar documentare cu cuvintele specificate: " + numarCuvinte);

        // d)
        afisareActoriiSiFilmeleInCareAuJucat(listaFilme);

        // e)
        sortareListaFilme(listaFilme);
        afisareListaFilme(listaFilme);
    }

    public static List<Film> creareListaFilme() {
        List<Film> listaFilme = new ArrayList<>();

        listaFilme.add(new Documentar("Documentar1", "Regizor1", 100000, 10, "Descriere documentar 1"));
        listaFilme.add(new Muzical("Muzical1", "Regizor2", 500000, creareListaActori()));
        listaFilme.add(new Documentar("Documentar2", "Regizor1", 80000, 5, "Descriere documentar 2"));
        listaFilme.add(new Muzical("Muzical2", "Regizor3", 300000, creareListaActori()));

        return listaFilme;
    }

    private static List<Actor> creareListaActori() {
        List<Actor> actori = new ArrayList<>();
        actori.add(new Actor("Actor1", "Dansator", "Cantor"));
        actori.add(new Actor("Actor2", "Dansator", "Cantor"));
        actori.add(new Actor("Actor3", "Dansator", "Cantor"));

        return actori;
    }

    private static void afisareListaFilme(List<Film> listaFilme) {
        System.out.println("Lista de filme:");
        for (Film film : listaFilme) {
            System.out.println(film.getClass().getSimpleName() + " - Titlu: " + film.getTitlu() +
                    ", Regizor: " + film.getRegizor() + ", Buget: " + film.getBuget());
        }
        System.out.println();
    }

    public static List<Film> extrageFilmeMuzicaleCuMaiPutiniActori(List<Film> listaFilme, int n) {
        List<Film> filmeMuzicaleCuMaiPutiniActori = new ArrayList<>();
        for (Film film : listaFilme) {
            if (film instanceof Muzical) {
                Muzical muzical = (Muzical) film;
                if (muzical.getActori().size() < n) {
                    filmeMuzicaleCuMaiPutiniActori.add(muzical);
                }
            }
        }
        return filmeMuzicaleCuMaiPutiniActori;
    }

    public static int numaraDocumentareCuCuvinteInDescriere(List<Film> listaFilme, String... cuvinte) {
        int numarDocumentare = 0;
        for (Film film : listaFilme) {
            if (film instanceof Documentar) {
                Documentar documentar = (Documentar) film;
                String descriere = documentar.getDescriereSubiect().toLowerCase();

                boolean containsAllWords = true;
                for (String cuvant : cuvinte) {
                    if (!descriere.contains(cuvant.toLowerCase())) {
                        containsAllWords = false;
                        break;
                    }
                }

                if (containsAllWords) {
                    numarDocumentare++;
                }
            }
        }
        return numarDocumentare;
    }

    public static void afisareActoriiSiFilmeleInCareAuJucat(List<Film> listaFilme) {
        System.out.println("Actorii si filmele in care au jucat:");
        Set<Actor> actoriDistincti = new HashSet<>();

        for (Film film : listaFilme) {
            if (film instanceof Muzical) {
                Muzical muzical = (Muzical) film;
                for (Actor actor : muzical.getActori()) {
                    actoriDistincti.add(actor);
                }
            }
        }

        for (Actor actor : actoriDistincti) {
            System.out.println("Actor: " + actor.getNume());
            for (Film film : listaFilme) {
                if (film instanceof Muzical) {
                    Muzical muzical = (Muzical) film;
                    if (muzical.getActori().contains(actor)) {
                        System.out.println("  - Titlu: " + film.getTitlu() + ", Regizor: " + film.getRegizor());
                    }
                }
            }
        }
        System.out.println();
    }

    public static void sortareListaFilme(List<Film> listaFilme) {
        // Sortare după buget și regizor
        listaFilme.sort(Comparator.comparing(Film::getBuget).thenComparing(Film::getRegizor));
    }
}
