package task1;

import java.util.UUID;

/**
 *
 * Класс Pet
 * @author Коваленко Александр
 */
public class Pet {
    public final UUID uuid;
    /**
     * Кличка
     */
    private String name;
    /**
     * Вес
     */
    private double weight;
    /**
     * Хозяин
     */
    private Person owner;

    public Pet(String name, double weight, Person owner) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.weight = weight;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", owner=" + owner +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
