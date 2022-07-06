public class Main {
    public static void main(String[] args) {
        // Task 1
        int year = 2022;
        printLeapYear(year);



    // Task2
    suggestInstallOs(0, 2019);
    // Task 3
        calculateDeliveryDays(150);


}


    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    private static void suggestInstallOs(int os, int deviceYear) {
        String resultString = buildResultString(os, deviceYear);
        System.out.println(resultString);

    }
    private static int calculateDeliveryDays(int distance){
        int time = distance/40 +1;
        System.out.println( "дней доставки: " + time );
        return distance;

    }


    private static String buildResultString(int os, int deviceYear) {
        int currentYear = 2015;
        StringBuilder stringBuilder = new StringBuilder();
        if (deviceYear < currentYear) {
            stringBuilder.append(" Установите лайт версию для ");
        } else {
            stringBuilder.append(" Установите полную версию для ");
        }
        if (os == 1) {
            stringBuilder.append(" Android ");
        } else {
            stringBuilder.append("IOS");
        }
        return stringBuilder.toString();

    }

}






