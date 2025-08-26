import java.util.Scanner; // Import Scanner for user input

// Class to represent a first name
class FirstName {
    public String firstName;

    public FirstName(String firstName) {
        this.firstName = firstName;
    }
}

// Class to represent a last name
class LastName {
    public String lastName;

    public LastName(String lastName) {
        this.lastName = lastName;
    }
}

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Initialize first names
        FirstName[] firstNames = new FirstName[5];
        {
            firstNames[0] = new FirstName("Arto");
            firstNames[1] = new FirstName("Eetu");
            firstNames[2] = new FirstName("Fiona");
            firstNames[3] = new FirstName("Harri");
            firstNames[4] = new FirstName("Iida");
        }

        // Initialize last names
        LastName[] lastNames = new LastName[5];
        {
            lastNames[0] = new LastName("Haverinen");
            lastNames[1] = new LastName("Suonsalmi");
            lastNames[2] = new LastName("Koivisto");
            lastNames[3] = new LastName("Laaksonen");
            lastNames[4] = new LastName("Malmenvuori");
        }

        // Ask how many first names to print
        System.out.print("How many first names would you like to print? ");
        int firstCount = scanner.nextInt();
        System.out.println("\nFirst Names:");
        for (int i = 0; i < firstCount && i < firstNames.length; i++) {
            System.out.println(firstNames[i].firstName);
        }

        // Ask how many last names to print
        System.out.print("\nHow many last names would you like to print? ");
        int lastCount = scanner.nextInt();
        System.out.println("\nLast Names:");
        for (int i = 0; i < lastCount && i < lastNames.length; i++) {
            System.out.println(lastNames[i].lastName);
        }

        // Ask how many full names to print (in order)
        System.out.print("\nHow many full names would you like to print (in order)? ");
        int fullCount = scanner.nextInt();
        System.out.println("\nFull Names:");
        for (int i = 0; i < fullCount && i < firstNames.length && i < lastNames.length; i++) {
            System.out.println(firstNames[i].firstName + " " + lastNames[i].lastName);
        }

        scanner.close(); // Close Scanner to free resources
    }
}
