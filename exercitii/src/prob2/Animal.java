package prob2;

public abstract class Animal {
    protected int varsta;
    protected String nume;
    protected Mediu mediu;

    public Animal(){}

    public Animal(int varsta, String nume, Mediu mediu){
        this.varsta = varsta;
        this.nume = nume;
        this.mediu = mediu;
    }
}
