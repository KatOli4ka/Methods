import java.time.LocalDate;

public class Main {
    public static void definitionLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void installationSoftware(int clientOS, int clientDeviceYear) {
        String operatingSystem = "";
        switch (clientOS) {
            case 0: operatingSystem = "iOS";
            case 1: operatingSystem = "Android";
        }

        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear <= currentYear) {
            System.out.println("«Установите облегченную версию приложения для " + operatingSystem + " по ссылке»");
        } else {
            System.out.println("Ссылка на скачивание приложения для " + operatingSystem);
        }

    }

    public static void calculationDaysDelivery(int deliveryDistance) {
        int minimalDeliveryTime = 1;

        if (deliveryDistance <= 19) {
            System.out.println("Для доставки вашей банковской карты нам потребуеться "
                    + minimalDeliveryTime + " день");
        } else if (deliveryDistance <= 59) {
            minimalDeliveryTime++;
            System.out.println("Для доставки вашей банковской карты нам потребуеться "
                    + minimalDeliveryTime + " дня");

        } else if (deliveryDistance <= 100) {
            minimalDeliveryTime += 2;
            System.out.println("Для доставки вашей банковской карты нам потребуеться "
                    + minimalDeliveryTime + " дня");
        }

    }

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        System.out.print("Введите год: ");
        int year = 567;

        definitionLeapYear(year);
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");

        System.out.print("Выберите свою операционную систему, введя 0 или 1: ");
        int clientOS = 0;
        int clientAndroid=1;

        System.out.print("Введите год производства вашего смартфона: ");
        int clientDeviceYear = 2012;

        installationSoftware(clientOS, clientDeviceYear);
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");

        System.out.print("Введите растояние(км) до вас: ");
        int deliveryDistance = 76;

        calculationDaysDelivery(deliveryDistance);
    }
}