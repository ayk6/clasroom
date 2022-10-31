package day22;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1.str); // catClass
        System.out.println(cat1.strMammal); // mammalClass
        System.out.println(cat1.strAnimal); // animalClass

        Mammal cat2 = new Cat();
        System.out.println(cat2.str); // mammalClass
        // System.out.println(cat2.strCat); CTE

        Animal cat3 = new Cat();
        System.out.println(cat3.str); // animalClass

        // Cat cat4 = new Mammal(); CTE
    }
}
