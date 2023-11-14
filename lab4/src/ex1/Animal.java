package ex1;

public class Animal {
    private String nume;

    public Animal(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
