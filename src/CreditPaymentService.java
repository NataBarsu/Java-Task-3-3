public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm) {
        double monthlyInterestRate = ((9.99 / 12) / 100);
        int loanTermInMonths = loanTerm * 12;
        double x = (1 + monthlyInterestRate);
        double a = Math.pow(x, loanTermInMonths);
        double annuityRatio = (monthlyInterestRate * a) / (a - 1);
        return (int) (annuityRatio * loanAmount);
    }
}
