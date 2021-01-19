public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int replenishment_amount = 1800;
        int limit = 1000;
        if (replenishment_amount > limit) {
            balance = balance + replenishment_amount + replenishment_amount / 100;
        } else {
            balance = balance + replenishment_amount;
        }
        System.out.println(balance);
    }
}
