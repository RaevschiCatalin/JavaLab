package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Zoo.
 */
public class Zoo {
    private String nume;
    private List<Animal> animale;

    /**
     * Instantiates a new Zoo.
     *
     * @param nume the nume
     */
    public Zoo(String nume) {
        this.nume = nume;
        this.animale = new ArrayList<>();
    }

    /**
     * Adauga animal.
     *
     * @param animal the animal
     */
    public void adaugaAnimal(Animal animal) {
        animale.add(animal);
    }

    /**
     * Raport hrana per luna map.
     *
     * @return the map
     */
    public Map<String, Integer> raportHranaPerLuna() {
        Map<String, Integer> hranaPerAnimal = new HashMap<>();

        for (Animal animal : animale) {
            String tipAnimal = animal.getClass().getSimpleName();
            hranaPerAnimal.put(tipAnimal, hranaPerAnimal.getOrDefault(tipAnimal, 0) + 1);
        }

        return hranaPerAnimal;
    }

    /**
     * Animale de tip list.
     *
     * @param <T> the type parameter
     * @param tip the tip
     * @return the list
     */
    public <T extends Animal> List<T> animaleDeTip(Class<T> tip) {
        List<T> animaleDeTip = new ArrayList<>();

        for (Animal animal : animale) {
            if (tip.isInstance(animal)) {
                animaleDeTip.add(tip.cast(animal));
            }
        }

        return animaleDeTip;
    }

}
