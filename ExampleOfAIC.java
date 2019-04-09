public class ExampleOfAIC {
    public static void main(String[] args) {
        // Using Class
        Dog d = new Dog();
        //d.speak();

        // Using Anonymous Inner Class
        Animal a = () -> {
            System.out.println("Hello");
        };

        a.speak();
    }
}

interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Woof! Woof!");
    }
}
