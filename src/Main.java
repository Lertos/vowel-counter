import java.util.Scanner;

public class Main {

    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        System.out.println("Please enter a sentence and press Enter. The vowels will be counted.");

        while (!response.equalsIgnoreCase("q")) {
            response = scanner.nextLine();

            if (response.equalsIgnoreCase("q")) {
                break;
            }

            int count = naiveApproach(response);

            System.out.println("Your text had " + count + " vowels in it.");
            System.out.println("\nSupply another phrase, or type 'q' to quit.");
        }
    }

    private static int naiveApproach(String text) {
        int count = 0;

        for(int i = 0; i<text.length(); i++) {
            for (char vowel : vowels) {
                if (vowel == text.charAt(i)) {
                    count += 1;
                    break;
                }
            }
        }

        return count;
    }
}