public class Main {
    public static void main(String[] args){
        Cat cat=new Cat();
        cat.bark();

        Animal animal=new Cat();
        animal.bark();

        animal=new Dog();
        animal.bark();
    }
}
