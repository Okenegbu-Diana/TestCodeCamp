// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner accept = new Scanner(System.in);
        System.out.println("Hello World! \n");
        System.out.println("Enter a number to count to: ");
        int loopCount = Integer.parseInt(accept.nextLine());
        for (int i = 1; i <= loopCount; i++) {
            System.out.println(i);
        }
    }
}