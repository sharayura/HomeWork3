public class Main {
    public static void main(String[] args) {
        task4();
    }
    public static void task4() {
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days+=1;
            System.out.println("Потребуется дней: " + days);
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days+=2;
            System.out.println("Потребуется дней: " + days);
        }
    }
}