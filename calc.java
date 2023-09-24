import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency = scanner.nextDouble();
        System.out.println("Enter amount of money");
        int hryvna = scanner.nextInt();
        int amount = (int) (hryvna / currency);
        double change = (hryvna - amount*currency);
        System.out.println("You can byu " + amount);
        System.out.println("Change is " + change);
}
}