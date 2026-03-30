import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        System.out.println("\n--- UC2: Passenger Bogie Management ---");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger Bogies after addition: " + passengerBogies);

        System.out.println("\nRemoving AC Chair...");
        passengerBogies.remove("AC Chair");

        System.out.println("Passenger Bogies after removal: " + passengerBogies);

        System.out.println("\nChecking if Sleeper exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        System.out.println("\nFinal Passenger Bogies: " + passengerBogies);
    }
}