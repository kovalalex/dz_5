package task1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(35, "Олег", Sex.MAN);
        Person person2 = new Person(20, "Илья", Sex.MAN);
        Person person3 = new Person(20, "Наташа", Sex.WOMAN);
        Pet pet = new Pet("Васька", 5, person);
        Pet pet2 = new Pet("Мурка", 3, person2);
        Pet pet3 = new Pet("Мурзик", 7, person3);
        PetCards petCards = new PetCards();

        try {
            petCards.addPet(pet);
            petCards.addPet(pet2);
            petCards.addPet(pet3);
           // petCards.addPet(pet);
        }
        catch (Exception e){
            System.out.println("Ошибка! "+e.getMessage());
        }
        petCards.viewPetsSortedByName();
        petCards.viewPetsSortedByWeight();
        petCards.viewPetsSortedByOwner();


    }
}