public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            int IOS = 0;
            boolean clientOSIos = IOS == 0;
            if (clientOSIos) {
                System.out.println("Установите версию приложения для iOS по ссылке");
                    }
            int Android = 1;
            boolean clientOsAndroid = Android == 1;
            if (clientOsAndroid) {
                System.out.println("Установите версию приложения для Android по ссылке");
                    }
        // задание 2
        int Ios = 0;
        int clientDeviceYear = 2014;
        boolean ClientOSIos = Ios == 0;
        if (ClientOSIos && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        int android = 1;
        boolean ClientOsAndroid = android == 1;
        if (ClientOsAndroid && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
            }

        }
