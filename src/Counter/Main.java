package Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(); // -> Using the default constructor
        System.out.println("initial value of counter1: " + counter1.getValue());

        counter1.increment();
        counter1.increment();
        System.out.println("Counter1 value after incrementing twice: " + counter1.getValue());

        counter1.decrease();
        System.out.println("Counter1 value after incrementing once: " + counter1.getValue());


        Counter counter2 = new Counter(10); // -> Using the constructor with parameters
        System.out.println("initial value of counter2: " + counter2.getValue());

        Counter counter3 = new Counter (counter1); // -> Using the copy constructor
        System.out.println("initial value of counter3 (copy of counter1): " + counter3.getValue());

        counter3.increment();
        System.out.println("Counter3 value after incrementing once: " + counter3.getValue());
    }
}
