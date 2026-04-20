package practice;

public interface Fridge {
    // abstract methods
    public String fridgeSound(); // interface method (no body)
    public int temperature();

//    non-abstract methods
    public default String person(String firstName, String lastName) {
        return firstName + lastName;
    }

    // default, private, static
    default void logError(String error) {
        printMsg(error);
    }

    private void printMsg(String msg) { // Shared logic
        System.out.println("LOG: " + msg);
    }
}
