package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("년도를 입력하세요: ");
        int inputYear = sc.nextInt();
        
        System.out.print("월을 입력하세요: ");
        int inputMonth = sc.nextInt();

        printCalendar(inputYear, inputMonth);
    }

    private static void printCalendar(int inputYear, int inputMonth) {
        LocalDate firstDayOfMonth = LocalDate.of(inputYear, inputMonth, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("  ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
