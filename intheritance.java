public class intheritance {
    public static void main(String[] args) {
        inheritance2 dog = new inheritance2();
        inheritance3 cat = new inheritance3();

        System.out.println(cat.isAlive);
        System.out.print(cat.name);
        cat.Speak();
        cat.Eat();

        System.out.println(cat.isAlive);
        System.out.print(dog.name);
        dog.Speak();
        dog.Sleep();
    }
}
