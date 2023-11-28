package singleton;

public class Driver {
    public static void main(String[] args) {
        DoubleCheckedSingleton doubleCheckedSingleton1 = DoubleCheckedSingleton.getInstance();

        DoubleCheckedSingleton doubleCheckedSingleton2 = DoubleCheckedSingleton.getInstance();

        System.out.println(doubleCheckedSingleton1);
        System.out.println(doubleCheckedSingleton2);
    }
}
