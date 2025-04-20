public class ClassesObjects {
    String name = "Java Object";

    public void display() {
        System.out.println("This is an example of a class and object.");
    }

    public static void main(String[] args) {
        ClassesObjects obj = new ClassesObjects();
        System.out.println("Name: " + obj.name);
        obj.display();
    }
}
