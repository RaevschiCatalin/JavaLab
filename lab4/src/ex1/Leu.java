package ex1;

public class Leu extends Animal{
    private String culoareBlana;

    public Leu(String nume, String culoareBlana) {
        super(nume);
        this.culoareBlana = culoareBlana;
    }

    public String getCuloareBlana() {
        return culoareBlana;
    }
}
