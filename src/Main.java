public class Main {
    public static void main(String[] args) {
        task7();
    }
    public static void task7() {
        int age = 25;
        int salary = 50_000;
        int wantedSum = 330_000;
        double stavka = 10;
        double maxpay;
        String answer = "Отказано";
        if (age< 23) { stavka += 1; }
        if (age>= 23 && age <30) { stavka += 0.5; }
        if (salary >= 80_000) { stavka -= 0.7; }
        maxpay = wantedSum * (stavka + 100) / 100 /12;
        if (salary * 0.5 >= maxpay) {
            answer = "Одобрено";
        }
        System.out.println("Максимальный платеж при ЗП равен " + (salary * 0.5) + " рублей. Платеж по кредиту "
                + maxpay + " рублей. " + answer);
    }
}