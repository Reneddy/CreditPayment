public class CreditPaymentService {
    public int calculate(int requestedAmount, double percentPerYear, int creditTerm) {
        double pow = Math.pow((1 + (percentPerYear / 1200)), (creditTerm * 12));
        return (int) (requestedAmount * ((percentPerYear / 1200) * pow /
                ((pow - 1))));
    }
}
