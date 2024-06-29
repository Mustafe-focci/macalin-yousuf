import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text to download:");
        String text = scanner.nextLine();

        downloadTextFile(text);

        System.out.println("File downloaded successfully.");
        scanner.close();
    }

    private static void downloadTextFile(String text) {
        File file = new File("downloaded_text.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
