public class Main {
    public static void main(String[] args) {
        // Task 1
        int year = 2022;
    }
        private static boolean isLeapYear (int year) {
          return  year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        }
        private static void printlnLeapYear (int year) {
            System.out.println("Год високосный");
        }
        private static void printlnNonLeapYear (int year) {
        System.out.println("Год не високосный");
    }
    public static void printYearInfo (int year) {
    if (isLeapYear (year)) {
        printlnLeapYear(year);
            } else {
        printlnNonLeapYear(year);

        }
        //Task2
    }
}