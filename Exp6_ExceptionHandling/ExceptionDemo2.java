public class ExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println("Number: " + numbers[5]); // This will throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
