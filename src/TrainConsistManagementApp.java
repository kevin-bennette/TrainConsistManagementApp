import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true;
            }
            else if (comparison > 0) {
                low = mid + 1;
            }
            else {
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
        scanner.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.print("\nEnter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = binarySearch(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        scanner.close();
    }
}