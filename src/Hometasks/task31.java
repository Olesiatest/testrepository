package Hometasks;

public class task31 {
    public static String helloWorld(int a) {
        if( a % 3 == 0 && a % 5 ==0) {
            return "Hello World!";

        } if (a % 3 ==0) {
            return "Hello";

        } if (a % 5 ==0) {
            return "World";
        } else {
            return "Значение не кратно 3 или 5";
        }

    }

}
