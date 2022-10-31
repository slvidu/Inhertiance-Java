public class Animal {
    public void run() {
        System.out.println("Can Run");
    }
}
class Dog extends Animal{
    public void jump() {
        System.out.println("Can Jump");
    }
}
class Cat extends Dog {
    public void climb() {
        System.out.println("Can't Climb");
    }
}
class Test{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.jump();
        cat.climb();
    }
}