package rezolvare2;

import java.util.*;


public class Main {
    //c
    public static void afisarePlante(ArrayList<Planta> plante){
        for(Planta p : plante){
            System.out.println(p);
        }
    }
    //d
    public static void sortarePlante(ArrayList<Planta> plante){
        plante.sort(Comparator.comparingDouble(Planta::getPret).thenComparing(Planta::getNume));
        System.out.println(plante);
    }
    public static void afisareInterval(ArrayList<Planta> plante, double pretMin, double pretMax){
        for(Planta p : plante){
            if(p.getPret() >= pretMin && p.getPret() <= pretMax){
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args){
        //a
        Planta p1 = new Planta(120, "Trandafir", false);
        System.out.println(p1);
        //c
        ArrayList<Planta> plante = new ArrayList<>();
        plante.add(p1);
        plante.add(new Pom(20, "Mar", false, 10));
        plante.add(new Floare(30, "Lalea", false, "Primavara"));
        afisarePlante(plante);
        sortarePlante(plante);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti pretul minim: ");
        double pretMin = scanner.nextDouble();
        System.out.println("Introduceti pretul maxim: ");
        double pretMax = scanner.nextDouble();
        afisareInterval(plante, pretMin, pretMax);
    }
}
