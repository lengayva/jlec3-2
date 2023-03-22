public class Main {
    public static void main(String[] args) {
        int InitialBalance = 100;
        int adding = 1100;
        int bonus = 0;
        if (adding > 1000) {
            bonus = adding / 100;
        }
        int FinalBalance = InitialBalance + adding + bonus;
        System.out.println("Итоговый счёт: " + FinalBalance);
        System.out.println("Бонус" + bonus);
    }
}
