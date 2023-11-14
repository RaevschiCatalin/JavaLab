package ex1;

public class Elefant extends Animal{
    private double lungimeTrompa;

    public Elefant(String nume, double lungimeTrompa) {
        super(nume);
        this.lungimeTrompa = lungimeTrompa;
    }

    public double getLungimeTrompa() {
        return lungimeTrompa;
    }
}
