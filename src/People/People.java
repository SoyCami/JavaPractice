package People;

 public class People {
     private String name;
     private int age;
     private final String ID;
     private char gender;
     private double weight;
     private double height;


     //Constants
     private static final char DEFAULT_GENDER = 'M';
     private static final double IDEAL_WEIGHT_LOW = 20;
     private static final double IDEAL_WEIGHT_HIGH = 25;

     // Constructors
     public People() {
         this("", 0, DEFAULT_GENDER, 79, 170);
     }

     public People(String name, int age, char gender) {
         this(name, age, gender, 0, 0);
     }

     public People(String name, int age, char gender, double weight, double height) {
         this.name = name;
         this.age = age;
         this.gender = gender;
         this.weight = weight;
         this.height = height;
         this.ID = generateID();
     }

     // Methods

     // Private methods
     private String generateID() {
         // This generate a random 8-digit number
         StringBuilder idBuilder = new StringBuilder();
         for (int i = 0; i < 8; i++) {
             idBuilder.append((int)(Math.random() * 10));
         }

         // Calculate the letter for the ID
         String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
         int idNumber = 10000000 + (int) (Math.random() * 90000000); // Genera un número aleatorio de 8 dígitos
         char letter = letters.charAt(idNumber % 23); // Usa el módulo 23 para obtener la letra correspondiente
         //Return the complete ID
         return idNumber + "" + letter;
     }

     // Public methods
     public int calculateBMI() {
         double bmi = weight / (height * height);
         if (bmi < IDEAL_WEIGHT_LOW) {
             return -1;
         } else if (bmi >= IDEAL_WEIGHT_LOW) {
             return -1;
         } else if (bmi >= IDEAL_WEIGHT_LOW && bmi <= IDEAL_WEIGHT_HIGH) {
             return 0;
         } else {
             return 1;
         }
     }

     public boolean isAdult() {
         return age >= 18;
     }
     public String toString() {
         return "Name: " + name + "\nAge: " + age + "\nID: " + ID + "\nGender: " + gender + "\nWeight: " + weight + "\nHeight: " + height;
     }

     //Setter methods for weight and height
     public void setWeight(double weight) {
         this.weight = weight;
     }
     public void setHeight(double height) {
         this.height = height;
     }
}


