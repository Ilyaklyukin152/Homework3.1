public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");

        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадача 2");

        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("\nЗадача 3");

        int year = 4;
        if (year >= 8 && year < 1584 && year % 4 == 0) {
            System.out.println(year + " год является високосным по юлианскому календарю");
        } else if (year >= 1584 && year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " год не является високосным");
            } else System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        System.out.println("\nЗадача 4");

        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance<=100){
            deliveryTime=3;
            if (deliveryDistance<=60){
                deliveryTime -= 1;
                if (deliveryDistance<=20){
                    deliveryTime -= 1;
                }
            }
            System.out.println("Потребуется дней: " +deliveryTime);
        }else System.out.println("Доставка не осуществляется");

        System.out.println("\nЗадача 5");
        byte monthNumber = 15;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber+" й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+" й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+" й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber+" й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}