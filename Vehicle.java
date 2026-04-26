public class Vehicle { // Create a class
        private String brand; // Declare private variables
        private String color; // Declarev private variables
        Vehicle(String brand, String color) { //Create a public constructor
                this.brand = brand;
                this.color = color;
        }
        void start() { // Create a public method
                System.out.println("Vehicle is starting...");
        }
}