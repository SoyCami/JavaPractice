package People;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // I implemented a Scanner object with Locale.US for decimal number input
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Prompt user for input
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter gender (M/F):");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter weight:");
        double weight = scanner.nextDouble();

        System.out.println("Enter height:");
        double height = Double.parseDouble(scanner.next().replace(",", "."));


        // Create Person objects
        People person1 = new People(name, age, gender, weight, height);
        People person2 = new People(name, age, gender);
        People person3 = new People();

        // Check weight and determine if adult for each person
        People[] people = {person1, person2, person3};
        for (People person : people) {
            int bmiResult = person.calculateBMI();
            boolean isAdult = person.isAdult();
            String bmiMessage = "";
            switch (bmiResult) {
                case -1:
                    bmiMessage = "Below ideal weight";
                    break;
                case 0:
                    bmiMessage = "Ideal weight";
                    break;
                case 1:
                    bmiMessage = "Overweight";
                    break;
            }
            System.out.println("\n" + person.toString());
            System.out.println("BMI: " + bmiMessage);
            System.out.println("Adult: " + isAdult);
        }

        scanner.close();
    }
}