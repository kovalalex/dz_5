package task1;

import java.util.*;

/**
 * Класс картотека питомцев
 * @author Александр Коваленко
 */
public class PetCards {
    /**
     * Hashmap для хранения и быстрого доступа по UUID
     */
    private HashMap<UUID, Pet> map = new HashMap<UUID, Pet>();

    /**
     * Метод добавления животного в базу
     * @param pet объект пет
     * @throws Exception если объект с таким UUID уже есть в базе
     */
    public void addPet(Pet pet) throws Exception {
        if (map.containsKey(pet.uuid)) {
            throw new Exception("Данное животное уже есть в базе!");
        }
        map.put(pet.uuid, pet);
    }

    /**
     * Получить ссылку на животное по UUID
     * @param uuid уникальный идентификатор животного
     * @return Pet
     */
    public Pet getPetByUUID(UUID uuid) {
        if (map.containsKey(uuid)) {
            return map.get(uuid);
        }
        return null;
    }

    /**
     * Обновить значения полей животного
     * @param pet
     */
    public void updatePet(Pet pet) {
        map.put(pet.uuid, pet);
    }

    /**
     * Вывести всех питомцев отсортированных по имени
     */
    public void viewPetsSortedByName(){
        ArrayList<Pet> list = new ArrayList<Pet>();
        for (Map.Entry<UUID, Pet> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Pet>() {
            public int compare(Pet o1, Pet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("-------pets sorted by name--------");
        for (Pet pet: list)
            System.out.println(pet);
        System.out.println("----------------------------------");
    }
    /**
     * Вывести всех питомцев отсортированных по весу
     */
    public void viewPetsSortedByWeight(){
        ArrayList<Pet> list = new ArrayList<Pet>();
        for (Map.Entry<UUID, Pet> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Pet>() {
            public int compare(Pet o1, Pet o2) {
                Double d1 = o1.getWeight();
                return d1.compareTo(o2.getWeight());
            }
        });

        System.out.println("-------pets sorted by weight--------");
        for (Pet pet: list)
            System.out.println(pet);
        System.out.println("-------------------------------------");
    }
    /**
     * Вывести всех питомцев отсортированных по хозяину
     */
    public void viewPetsSortedByOwner(){
        ArrayList<Pet> list = new ArrayList<Pet>();
        for (Map.Entry<UUID, Pet> entry: map.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list, new Comparator<Pet>() {
            public int compare(Pet o1, Pet o2) {
                return o1.getOwner().compareTo(o2.getOwner());
            }
        });

        System.out.println("-------pets sorted by owner--------");
        for (Pet pet: list)
            System.out.println(pet);
        System.out.println("-------------------------------------");
    }
}
