import java.util.Scanner;
public class circleOperations {
    public static void main(String[] args){
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine();
        int choice;

        System.out.print("""
                1) Circumference
                2) Area
                3) Volume
                4) Diameter
                Enter your choice(1-4): """);
        choice = scanner.nextInt();

        if(choice == 1){
//            Circumference of a circle
            double circumference;
            circumference = 2 * Math.PI * radius;
            System.out.println("The circumference of the circle with radius " + radius + "cm is " + circumference + "cm.");
        }
        else if(choice == 2){
//            Area of a circle
            double area;
            area = Math.PI * Math.pow(radius, 2);
            System.out.println("The area of the circle with radius " + radius + "cm is " + area + "cm^2.");
        }
        else if (choice == 3){
//            Volume of a sphere with the same radius
            double volume;
            volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
            System.out.println("The volume of the sphere with radius " + radius + "cm is " + volume + "cm^3.");
        }
        else if (choice == 4){
//             Diameter of a circle
            double diameter;
            diameter = 2 * radius;
            System.out.println("The diameter of a cirlce with radius "+ radius + "cm is " + diameter + "cm.");
        }
        else{
            System.out.println("Enter a valid choice...");
        }

        scanner.close();
    }
}
