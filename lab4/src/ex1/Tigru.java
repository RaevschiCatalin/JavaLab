package ex1;

public class Tigru extends Animal{
    private int numarDungi;

    public Tigru(String nume, int numarDungi) {
        super(nume);
        this.numarDungi = numarDungi;
    }

    public int getNumarDungi() {
        return numarDungi;
    }
}
