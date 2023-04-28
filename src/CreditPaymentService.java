public class CreditPaymentService {
    public double calculate(double sum, double percent, double months ){
        double result;
        double x = percent / months / 100;
        result = sum * x * Math.pow((1+x), months) / (Math.pow((1+x), months)-1);
        return result;
    }
}
