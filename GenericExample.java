public class GenericExample<T> {
    T value;

    public GenericExample(T value) {
        this.value = value;
    }

    public void showType() {
        System.out.println("Type of T is: " + value.getClass().getName());
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        GenericExample<Integer> intObj = new GenericExample<>(100);
        intObj.showType();

        GenericExample<String> strObj = new GenericExample<>("Hello Generics");
        strObj.showType();
    }
}
