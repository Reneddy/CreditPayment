public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int requestedAmount = 1000000;
        double percentPerYear = 9.99;
        int creditTerm1 = 1;
        int payment = service.calculate(requestedAmount, percentPerYear, creditTerm1);
        System.out.println("Ежемесячный платеж составит: " + payment);
        int creditTerm2 = 2;
        int payment2 = service.calculate(requestedAmount, percentPerYear, creditTerm2);
        System.out.println("Ежемесячный платеж составит: " + payment2);
        int creditTerm3 = 3;
        int payment3 = service.calculate(requestedAmount, percentPerYear, creditTerm3);
        System.out.println("Ежемесячный платеж составит: " + payment3);
    }
}