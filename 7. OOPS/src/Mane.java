import java.time.LocalDate;
import java.time.Period;

public class Mane {
    public static void main(String[] args) {
        // Parse the start and end dates
        LocalDate startDate = LocalDate.parse("2022-01-01");
        LocalDate endDate = LocalDate.parse("2022-01-31");

        // Calculate the difference between the two dates
        Period difference = Period.between(startDate, endDate);

        // Print the number of days
        System.out.println(difference.getDays());
    }
}
