import java.util.*;

public class RandomList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(rand.nextInt(0, 100));
        }

        do {
            option = getOption(scanner);
            switch (option) {
                case 1:
                    System.out.print("Enter the number you wanna push: ");
                    array.add(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the index you wanna rewrite: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter the number you wanna place: ");
                    array.set(index, scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Enter the index of the number you wanna delete: ");
                    array.remove(scanner.nextInt());
                    break;
                case 4:
                    System.out.println(array);
                    break;
                case 5:
                    Collections.sort(array);
                    break;
                case 6:
                    array.sort(Collections.reverseOrder());
                    break;
            }
        } while(option != 0);
    }
    public static int getOption(Scanner scanner) {
        System.out.print("""
                \n[1] Push;
                [2] Rewrite;
                [3] Delete;
                [4] Show;
                [5] Sort ascending;
                [6] Sort descending;
                [0] Exit;
                >>>\s""");
        return scanner.nextInt();
    }
}
