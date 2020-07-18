public class Main {
    public static void main(String[] args) {
        AnnuityPayment annuityPay = new AnnuityPayment();
        int payment1 = (int) annuityPay.calculate(1_000_000, 9.99, 12);
        int payment2 = (int) annuityPay.calculate(1_000_000, 9.99, 24);
        int payment3 = (int) annuityPay.calculate(1_000_000, 9.99, 36);
        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);

    }
}
