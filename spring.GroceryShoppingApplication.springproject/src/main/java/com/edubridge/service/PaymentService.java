package com.edubridge.service;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.edubridge.model.Payment;
@Repository
public interface PaymentService {
	
    public Payment generatePayment(int cart_id,int userId,Payment payment);
	public List<Payment> getAllPayments();
    public Payment getPaymentById(int payment_id);
    public void cancelPaymentById(int payment_id);
    public Payment updatePaymentById(int payment_id,Payment payment);
    
}
