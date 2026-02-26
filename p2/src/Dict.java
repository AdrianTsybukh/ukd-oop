import java.util.*;

public class Dict {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> words = new HashMap<>();

        int option;

        do {
            option = getOption(scanner);
            switch (option) {
                case 1:
                    addWord(words, scanner);
                    break;
                case 2:
                    System.out.println(getTranslation(words, scanner));
                    break;
                case 3:
                    printDict(words);
                    break;
                case 4:
                    deleteWord(words, scanner);
                    break;
            }
        } while(option != 0);
    }

    static void addWord(HashMap<String, String> map, Scanner sc) {
        System.out.print("Enter the word you wanna add: ");
        String word = sc.nextLine();
        System.out.print("Enter the translation of the word: ");
        String translation = sc.nextLine();
        map.put(word, translation);
    }

    static String getTranslation(HashMap<String, String> map, Scanner sc) {
        System.out.print("Enter the word you wanna get translation of: ");
        String word = sc.nextLine();
        return map.get(word);
    }

    static void printDict(HashMap<String, String> map) {
        System.out.println(map);
    }

    static void deleteWord(HashMap<String, String> map, Scanner sc) {
        System.out.print("Enter the word you wanna delete: ");
        String word = sc.nextLine();
        map.remove(word);
    }

    public static int getOption(Scanner scanner) {
        System.out.print("""
                \n[1] Add word;
                [2] Get word;
                [3] Show all;
                [4] Delete word;
                [0] Exit;
                >>>\s""");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
