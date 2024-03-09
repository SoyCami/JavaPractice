package Counter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }
    public Counter(int initialValue) {
        this.value = initialValue;
    }
    public Counter(Counter otherCounter) {
        this.value = otherCounter.getValue();
    }
    public void increment() {
        value++;
    }
    public void decrease() {
        value--;
    }
    // Get the current value
    public int getValue() {
        return value;
    }
    // To set a new value
    public void setValue(int newValue) {
        this.value = newValue;
    }
}