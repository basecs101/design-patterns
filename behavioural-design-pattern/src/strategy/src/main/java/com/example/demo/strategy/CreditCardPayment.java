package strategy.src.main.java.com.example.demo.strategy;


@Component
public class CreditCardPayment implements PaymentMethod {
    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.01;
    }
}
