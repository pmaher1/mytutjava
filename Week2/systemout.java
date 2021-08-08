package systemout;

public class WriteToConsole {
    /**
     * Prints the phrase "Hello, user!" to the system out console.
     */
    public void printHelloUser() {
        System.out.println("Hello, user!");
    }

    /**
     * Prints the phrase "Hello, user!" to the system out console (i.e. the first line),
     * followed by "Greetings!" on a new line (i.e. the second line).
     */
    public void printHelloUserNewline() {
        System.out.println("Hello, user!");
        System.out.println("Greetings!");
    }

    /**
     * Prints the phrase "Hello, user!" to the system out console (i.e. the first line),
     * followed by two blank lines,
     * followed by "Greetings!" on the fourth line.
     */
    public void printHelloUserBlankLines() {
        System.out.println("Hello, user!\n\n");
        System.out.println("Greetings!");
    }
}
