public class oopInJava {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple", "Macbook", "M1", 2020);
        Laptop laptop2 = new Laptop("Lenovo", "LOQ", "Ryzon 7", 2025);
        Laptop laptop3 = new Laptop("HP", "Victus", "i5", 2023);
        Laptop laptop4 = new Laptop("Sony");
        Laptop laptop5 = new Laptop("Acer", "Flybook");

        System.out.println(laptop1.make + " " + laptop1.model + " " + laptop1.processor);
        System.out.println(laptop2.make + " " + laptop2.model + " " + laptop2.processor);
        System.out.println(laptop3.make + " " + laptop3.model + " " + laptop3.processor);
        System.out.println(laptop4.make + " " + laptop4.model + " " + laptop4.processor);
        System.out.println(laptop5.make + " " + laptop5.model + " " + laptop5.processor);

        laptop1.gamingMode();
        laptop2.stop();
        laptop3.start();

        System.out.println("Total number of Laptops: " + Laptop.numberOfLaptop);
    }
}
