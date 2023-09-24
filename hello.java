import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Привіт, як тебе звати?");
        name = scanner.nextLine();
        System.out.println("Скільки тобі років?");
        age = scanner.nextInt();
        System.out.println("Привіт, " + name);
        System.out.println("Я знаю що тобі " + age + " років");

    }
}