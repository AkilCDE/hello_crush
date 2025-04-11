interface Animal {
    void sound();
    }
    interface Pet {
    void play();
}

class Dog implements Animal, Pet {
@Override
public void sound() {
System.out.println("Dog barks");
}

@Override
public void play() {
System.out.println("Dog plays");
}
}

public class App {
    public static void main(String[] args) throws Exception {
       Dog dog = new Dog();
         dog.sound();
            dog.play();
            

    }
}
