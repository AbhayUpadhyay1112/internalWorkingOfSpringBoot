package com.codingshuttle.youtube.internalWorkingOfSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentService  {

//    @Override
    public String pay(){
        String payment = "Razorpay payment";
        System.out.print("payment from:"+payment);
        return payment;
    }
}
