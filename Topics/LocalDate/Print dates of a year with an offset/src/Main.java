import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();
        int offset = scanner.nextInt();
        LocalDate date = LocalDate.parse(dateString);
        int nextYear = date.getYear();
        for (int i = 0; i < offset && date.getYear() == nextYear; i++) {
            System.out.println(date);
            date = date.plusDays(offset);
        }
    }
}