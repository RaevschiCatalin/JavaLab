package ex1;

public class Flamingo extends Animal{
    private String culoare;

    public Flamingo(String nume, String culoare) {
        super(nume);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }
}
