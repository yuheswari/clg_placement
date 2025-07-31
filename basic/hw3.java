import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCoins = scanner.nextInt();
        int benPercent = scanner.nextInt();
        int blackbeardPercent = scanner.nextInt();

        int benShare = (totalCoins * benPercent) / 100;

        int remainingAfterBen = totalCoins - benShare;

        int blackbeardShare = (remainingAfterBen * blackbeardPercent) / 100;

        int remainingForOthers = remainingAfterBen - blackbeardShare;

        int otherPiratesShare = remainingForOthers / 3;

        System.out.println(benShare);
        System.out.println(blackbeardShare);
        System.out.println(otherPiratesShare);

        scanner.close();
    }
}