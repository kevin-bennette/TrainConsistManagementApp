import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }
        }

        System.out.print("\nEnter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found in the train consist.");
            } else {
                System.out.println("Bogie ID " + searchKey + " NOT found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}