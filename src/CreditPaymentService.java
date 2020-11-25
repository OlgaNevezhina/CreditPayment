public class CreditPaymentService {
    public float calculate (int loanAmount, int loanPeriod, float percent) {
        float i = 1 + percent;
        float k = (float) Math.pow(i, loanPeriod);
        float s = percent / (k - 1);
        int monthlyPayment;
        monthlyPayment = (int) (loanAmount * (percent + s));
        return monthlyPayment;
    }
}
