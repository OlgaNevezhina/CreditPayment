public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int loanPeriod = 12;
        float percent = 0.008325f;
        float monthlyPayment = service.calculate(1_000_000, 12, 0.008325f);
        System.out.println(monthlyPayment);

        float monthlyPaymentTwoYears = service.calculate(1_000_000, 24, 0.008325f);
        System.out.println(monthlyPaymentTwoYears);

        float monthlyPaymentThreeYears = service.calculate(1_000_000, 36, 0.008325f);
        System.out.println(monthlyPaymentThreeYears);
    }
}
