import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
  private ArrayList<String> groceryList = new ArrayList<>();

  // Add item to grocery list
  public void addItem(String item) {
    groceryList.add(item);
    System.out.println(item + " has been added to your grocery list.");
  }

  // Remove item from grocery list
  public void removeItem(String item) {
    if (groceryList.contains(item)) {
      groceryList.remove(item);
      System.out.println(item + " has been removed from your grocery list.");
    } else {
      System.out.println(item + " is not in the list.");
    }
  }

  // Print the grocery list
  public void printList() {
    if (groceryList.isEmpty()) {
      System.out.println("Your grocery list is empty.");
    } else {
      System.out.println("Your grocery list:");
      for (int i = 0; i < groceryList.size(); i++) {
        System.out.println((i + 1) + ". " + groceryList.get(i));
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GroceryList groceryList = new GroceryList();
    boolean quit = false;

    while (!quit) {
      System.out.println("\nMenu:");
      System.out.println("1. Add item");
      System.out.println("2. Remove item");
      System.out.println("3. View grocery list");
      System.out.println("4. Quit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Clear the buffer

      switch (choice) {
        case 1:
          System.out.print("Enter item to add: ");
          String addItem = scanner.nextLine();
          groceryList.addItem(addItem);
          break;
        case 2:
          System.out.print("Enter item to remove: ");
          String removeItem = scanner.nextLine();
          groceryList.removeItem(removeItem);
          break;
        case 3:
          groceryList.printList();
          break;
        case 4:
          quit = true;
          System.out.println("Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }

    scanner.close();
  }
}