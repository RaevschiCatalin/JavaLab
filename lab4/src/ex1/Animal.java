package ex1;

/**
 * The type Animal.
 */
public class Animal {
    private String nume;

    /**
     * Instantiates a new Animal.
     *
     * @param nume the nume
     */
    public Animal(String nume) {
        this.nume = nume;
    }

    /**
     * Gets nume.
     *
     * @return the nume
     */
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
