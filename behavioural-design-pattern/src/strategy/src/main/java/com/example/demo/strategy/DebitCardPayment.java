package strategy.src.main.java.com.example.demo.strategy;


@Component
    class DebitCardPayment implements PaymentMethod {
        @Override
        public double calculateProcessingFee(double amount) {
            return amount * 0.02;
        }
    }

