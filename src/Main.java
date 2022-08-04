public class Main {
    public static void main(String[] args) {
        task6();
    }
    public static void task6() {
        int age = 19;
        int salary = 58_000;
        int credit;
        if (age< 23) { credit = salary * 2; }
        else credit = salary * 3;
        if (salary >= 50_000 && salary < 80_000) { credit *= 1.2; }
        if (salary >= 80_000 ) { credit *= 1.5; }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");
    }
}