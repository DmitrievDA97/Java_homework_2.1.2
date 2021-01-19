public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int replenishmentAmount = 1_800;
        int limit = 1000;
        if (replenishmentAmount > limit) {
            balance = balance + replenishmentAmount + replenishmentAmount / 100;
        } else {
            balance = balance + replenishmentAmount;
        }
        System.out.println(balance);
    }
}
