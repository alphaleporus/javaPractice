public class Laptop {
        static int numberOfLaptop= 0;
        String make ;
        String model ;
        String processor ;
        int release ;
        boolean isRunning = false;

        Laptop(String make, String model, String processor, int release){
                this.make = make;
                this.model =model;
                this.processor =processor;
                this.release = release;
                numberOfLaptop++;
        }
        Laptop(String make, String model, String processor){
                this.make = make;
                this.model =model;
                this.processor =processor;
                release = 0;
                numberOfLaptop++;
        }
        Laptop(String make, String model){
                this.make = make;
                this.model = model;
                processor = "Not available";
                release = 0;
                numberOfLaptop++;
        }
        Laptop(String make){
                this.make = make;
                model = "Not available";
                processor = "Not available";
                release = 0;
                numberOfLaptop++;
        }
        Laptop(){
                make = "Not available";
                model = "Not available";
                processor = "Not available";
                release = 0;
                numberOfLaptop++;
        }

        void start() {
                System.out.println(this.model + " is turned on...");
                isRunning = true;
        }

        void stop(){
                System.out.println(this.model + " is turned off...");
                isRunning = false;
        }

        void gamingMode(){
                System.out.println("Gaming mode is on...");
        }
}
