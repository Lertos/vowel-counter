import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        System.out.println("Please enter a sentence and press Enter. The vowels will be counted.");

        while (!response.equalsIgnoreCase("q")) {
            response = scanner.nextLine();

            //Ignore empty strings
            if (response.isEmpty()) {
                continue;
            }

            //Debugging - to see their response
            System.out.println(response);
        }
    }
}