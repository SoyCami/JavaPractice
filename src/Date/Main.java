package Date;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(); // Using current date
        System.out.println("Current date: " + date1);

        Date date2 = new Date(2024, 2, 29); // Creating a specific date
        System.out.println("Specified date: " + date2);

        date2.addOneDay(); // Adding one day to the specified date
        System.out.println("Date after adding one day: " + date2);
    }
}
