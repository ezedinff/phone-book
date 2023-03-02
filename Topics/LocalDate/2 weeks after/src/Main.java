import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.next();
        System.out.println(LocalDate.parse(dateString).plusDays(14));
    }
}