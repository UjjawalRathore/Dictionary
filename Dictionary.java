import java.util.*;

// Main class
// Implementation of TreeMap
public class Dictionary {

    // Declaring a TreeMap
    static TreeMap<String, String> t;

    // To create TreeMap
    static void create() {

        // Creating an empty TreeMap
        t = new TreeMap<String, String>();

        System.out.println("TreeMap successfully"
                + " created");
    }

    // To Insert values in the TreeMap
    static void insert() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        String keys[] = new String[n];
        String values[] = new String[n];

        for (int i = 0; i < n; i++) {

            keys[i] = sc.next();

            values[i] = sc.next();

            t.put(keys[i], values[i]);
        }

        System.out.println("\nElements successfully" + " inserted in the TreeMap");
    }

    // To display the elements in TreeMap
    static void display() {

        // Displaying the TreeMap
        System.out.println("\nDisplaying the TreeMap:");

        System.out.println("TreeMap: " + t);
    }

    // To search a key in TreeMap
    static void search() {
        System.out.println("Search the key");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        System.out.println();
        System.out.println(key + " :-  " + t.get(key));

    }

    // to delete a key in TreeMap
    static void delete() {
        System.out.println("Enter the key to delete");
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        System.out.println();
        System.out.println(key + " :-  " + t.remove(key) + " Has been deleted");
    }

    // Main method
    public static void main(String[] args) {
        int choice;

        // Calling above defined methods inside main()
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------------------------------");
            System.out.println("1.CREATE TREEMAP");
            System.out.println("2.ADD ELEMENTS");
            System.out.println("3.DISPLAY CONTENTS OF DICTIONARY");
            System.out.println("4.SEARCH FOR KEY IN DICTIONARY");
            System.out.println("5.DELETE THE ELEMENT FROM THE DICTIONARY");
            System.out.println("6.EXIT FROM DICTIONARY");
            System.out.println("----------------------------------------------");
            System.out.println("ENTER THE CHOICE:-");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Creating a TreeMap
                    create();

                    break;
                case 2:
                    // Inserting the elements in the TreeMap
                    insert();
                    break;
                case 3:
                    // Display the elements in TreeMap
                    display();

                    break;
                case 4:
                    // Search given key in the TreeMap
                    search();

                    break;
                case 5:
                    // deleting given key in TreeMap
                    delete();
                    break;
                case 6:
                    // Exiting the TreeMap

                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (choice != 6);
    }
}