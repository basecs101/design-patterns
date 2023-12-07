package com.example.demo.strategy;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
    @Slf4j
    public class PaymentService {
        private final PaymentMethod creditCardPayment;
        private final PaymentMethod debitCardPayment;
        private final PaymentMethod netBankingPayment;
        private final PaymentMethod upiPayment;
        private final PaymentMethod codPayment;


        private Map<String, PaymentMethod> paymentMethodsMap;

        PaymentService(PaymentMethod creditCardPayment,
                       PaymentMethod debitCardPayment, PaymentMethod netBankingPayment, PaymentMethod upiPayment, PaymentMethod codPayment) {
            this.creditCardPayment = creditCardPayment;
            this.debitCardPayment = debitCardPayment;
            this.netBankingPayment = netBankingPayment;
            this.upiPayment = upiPayment;
            this.codPayment = codPayment;
        }

        @PostConstruct
        void init() {
            paymentMethodsMap = new HashMap<>();
            paymentMethodsMap.put("CreditCard", creditCardPayment);
            paymentMethodsMap.put("DebitCard", debitCardPayment);
            paymentMethodsMap.put("NetBanking", netBankingPayment);
            paymentMethodsMap.put("UPI",upiPayment);
            paymentMethodsMap.put("COD",codPayment);
        }

        public void processPayment(double amount, String paymentMethod) {
            System.out.println("Processed amount:"+
                    paymentMethodsMap.get(paymentMethod)
                            .calculateProcessingFee(amount));
        }
    }

