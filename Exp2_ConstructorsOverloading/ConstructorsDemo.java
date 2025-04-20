public class ConstructorsDemo {
    String name;
    int age;

    // Default constructor
    ConstructorsDemo() {
        name = "Default Name";
        age = 0;
    }

    // Parameterized constructor
    ConstructorsDemo(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorsDemo obj1 = new ConstructorsDemo();
        ConstructorsDemo obj2 = new ConstructorsDemo("Dheer", 20);

        obj1.display();
        obj2.display();
    }
}
