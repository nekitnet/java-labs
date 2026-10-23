public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        counter.decrement();
        counter.decrement();
        System.out.println("Значение счетчика: " + counter.getValue());
    }
}
