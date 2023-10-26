package prob1;

public class prob1 {
    public static Double sumArea(Figura[] figuri) {
        Double sum = 0.0;
        for (Figura figura : figuri) {
            if(figura instanceof Dreptunghi){
                sum += figura.getArea();
            }
        }
        return sum;
    }
    public static void eliminaCerc(Figura[] figuri) {
        for (int i = 0; i < figuri.length; i++) {
            if(figuri[i] instanceof Cerc){
                figuri[i] = null;
            }
        }
    }
    public static void main(String[] args) {
        Figura[] figuri = new Figura[4];
        figuri[0] = new Cerc(3,false);
        figuri[1] = new Dreptunghi(2, 3, true);
        figuri[2] = new Cerc(2,true);
        figuri[3] = new Trapez(2, 3, 4, false);
        for (Figura figura : figuri) {
            System.out.println(figura);
        }
        System.out.println("Suma ariilor dreptunghiurilor este: " + sumArea(figuri));
        eliminaCerc(figuri);
        for (Figura figura : figuri) {
            System.out.println(figura);
        }
    }
}
