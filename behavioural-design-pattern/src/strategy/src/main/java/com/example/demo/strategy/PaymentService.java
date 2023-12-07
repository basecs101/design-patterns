package strategy.src.main.java.com.example.demo.strategy;


import java.util.HashMap;
import java.util.Map;

@Service
    @Slf4j
    public class PaymentService {
        private final PaymentMethod creditCardPayment;
        private final PaymentMethod debitCardPayment;
        private final PaymentMethod netBankingPayment;
        private Map<String, PaymentMethod> paymentMethodsMap;

        PaymentService(PaymentMethod creditCardPayment,
                       PaymentMethod debitCardPayment, PaymentMethod netBankingPayment) {
            this.creditCardPayment = creditCardPayment;
            this.debitCardPayment = debitCardPayment;
            this.netBankingPayment = netBankingPayment;
        }

        @PostConstruct
        void init() {
            paymentMethodsMap = new HashMap<>();
            paymentMethodsMap.put("CreditCard", creditCardPayment);
            paymentMethodsMap.put("DebitCard", debitCardPayment);
            paymentMethodsMap.put("NetBanking", netBankingPayment);
        }

        public void processPayment(double amount, String paymentMethod) {
            log.info("Processed amount: {}",
                    paymentMethodsMap.get(paymentMethod)
                            .calculateProcessingFee(amount));
        }
    }

