import java.util.Scanner;

public class TrainConsistManagementApp {

    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchKey)) {
                return true;
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

        System.out.print("\nEnter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        scanner.close();
    }
}