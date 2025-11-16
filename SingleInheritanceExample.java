public class SingleInheritanceExample {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}