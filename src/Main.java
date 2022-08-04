public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task3() {
        int year = 2100;
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}