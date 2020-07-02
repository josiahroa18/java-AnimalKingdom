package animalkingdom;

import java.util.ArrayList;
import java.util.List;

public class Main{
    private static List<AbstractAnimal> filteredAnimals = new ArrayList<>();

    private static void filter(List<AbstractAnimal> animalList, CheckAnimal tester){
        filteredAnimals.clear();

        for(AbstractAnimal animal : animalList){
            if(tester.test(animal)){
                filteredAnimals.add(animal);
            }
        }
    }
    public static void main(String[] args){
        List<AbstractAnimal> animalList = new ArrayList<>();
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadilo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pidgeon = new Birds("Pidgeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadilo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pidgeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        System.out.println("*** MVP *** \n");
        System.out.println("*** List all the animals in descending order by year named ***");
        animalList.sort((animalOne, animalTwo) -> Integer.compare(animalTwo.getYear(), animalOne.getYear()));
        System.out.println(animalList);

        System.out.println("\n*** List all the animals alphabetically ***");
        animalList.sort((animalOne, animalTwo) -> animalOne.getName().compareToIgnoreCase(animalTwo.getName()));
        System.out.println(animalList);

        System.out.println("\n*** List all the animals order by how they move ***");
        animalList.sort((animalOne, animalTwo) -> animalOne.move().compareToIgnoreCase(animalTwo.move()));
        System.out.println(animalList);

        System.out.println("\n*** List only those animals the breath with lungs ***");
        filter(animalList, animal -> animal.breathe().equals("lungs"));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breathe() + " " + animal.getYear()));

        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filter(animalList, animal -> animal.breathe().equals("lungs") && animal.getYear() == 1758);
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breathe() + " " + animal.getYear()));


        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filter(animalList, animal -> animal.reproduce().equals("eggs") && animal.breathe().equals("lungs"));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breathe() + " " + animal.getYear()));


        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        filter(animalList, animal -> animal.getYear() == 1758);
        filteredAnimals.sort((animalOne, animalTwo) -> animalOne.getName().compareToIgnoreCase(animalTwo.getName()));
        filteredAnimals.forEach(animal -> System.out.println(animal.getName() + " " + animal.reproduce() + " " + animal.move() + " " + animal.breathe() + " " + animal.getYear()));
    }
}