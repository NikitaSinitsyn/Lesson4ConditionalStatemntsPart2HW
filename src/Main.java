public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");


        // Exercise 2
        int newClientOS = 0;
        int clientDeviceYear = 2015;
        if (newClientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Exercise 3
        int year = 2020;
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (isLeapYear) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");

        // Exercise 4
        int deliveryDistance = 95;
        int daysForDelivery = 1;
        if (deliveryDistance < 0) {
            System.out.println("Wrong distance!");
        } else {
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + daysForDelivery);
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                daysForDelivery++;
                System.out.println("Потребуется дней: " + daysForDelivery);
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                daysForDelivery = daysForDelivery + 2;
                System.out.println("Потребуется дней: " + daysForDelivery);
            }
        }

        // Exercise 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong month");
        }
    }
}
