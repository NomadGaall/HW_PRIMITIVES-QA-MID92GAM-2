public class Main {
    public static void main(String[] args) {

        int balance;
        int income;
        int bonusItem;
        int bonus = 0;

        balance = 100; //Изначальный баланс
        income = 1100; // Пополнение на сумму
        bonusItem = 100;

        if (income > 1000) {
            bonus = income / bonusItem;
        }

        balance += bonus + income;
        System.out.println("Начальный баланс: " + balance + " рублей");
        System.out.println("Сумма пополнения: " + income + " рублей");
        System.out.println("Начислено " + bonus + " бонусных рублей");
        System.out.println("Итого на счету " + balance + " рублей");
    }
}