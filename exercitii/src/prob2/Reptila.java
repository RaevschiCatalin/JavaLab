package prob2;

public abstract class Reptila extends Animal{
    protected int nrOua;

    public Reptila(){}

    public Reptila(int varsta, String nume, Mediu mediu, int nrOua){
        super(varsta, nume, mediu);
        this.nrOua = nrOua;
    }
}
