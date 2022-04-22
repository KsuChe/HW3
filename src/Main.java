public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            int IOS = 0;
            int clientDeviceYear = 2018;
            boolean clientOSIos = IOS == 0;
            if (clientOSIos && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
                    } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            int Android = 1;
            boolean clientOsAndroid = Android == 1;
            if (clientOsAndroid && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
                    } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

            }

    }



