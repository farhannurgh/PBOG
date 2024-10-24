//ANIMAL
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}


//CAT
public class Cat extends Animal {

    public Cat(String name) {
        super(name); 
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meow.");
    }

    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }
}


//MAIN
public class Main {
    public static void main(String[] args) {
        Cat Cat = new Cat("Buddy");
        
        Cat.makeSound();  
        Cat.fetch(); 
    }
}


