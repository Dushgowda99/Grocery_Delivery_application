package com.edubridge.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.exception.ResourceNotFoundException;
import com.edubridge.model.Payment;
import com.edubridge.model.User;
import com.edubridge.model.Cart;
import com.edubridge.repository.PaymentRepository;
import com.edubridge.service.CartService;
import com.edubridge.service.PaymentService;
import com.edubridge.service.UserService;

@Service
public class PaymentServiceImpl implements PaymentService {
@Autowired
PaymentRepository paymentRepository;

@Autowired
UserService userService ;

@Autowired
CartService cartService ;

public PaymentServiceImpl(PaymentRepository paymentRepository) {
	this.paymentRepository=paymentRepository;
}
	@Override
	public Payment generatePayment(int cart_id,int userId,Payment payment) {
		System.out.println("inside payment service");
		User user=userService.getUserById(userId);
		Cart cart = cartService.getCartItemByCartId(cart_id);
		payment.setUserId(user);
		payment.setCart_id(cart);
		payment.setAmount(cart.getTotal_cost());
		payment.setPaymentDate(new Date());
		return paymentRepository.save(payment);
	}
	@Override
	public List<Payment> getAllPayments() {
		
		return paymentRepository.findAll();
	}
	@Override
	public Payment getPaymentById(int payment_id) {
		
		return paymentRepository.findById(payment_id).orElseThrow(()->new ResourceNotFoundException("Payment","payment_id",payment_id));
	}
	@Override
	public void cancelPaymentById(int payment_id) {
      
	   paymentRepository.deleteById(payment_id);
	}
	@Override
	public Payment updatePaymentById(int payment_id, Payment payment) {
	  Payment payment1 = getPaymentById(payment_id);
	  payment1.setPaymentType(payment.getPaymentType());
	  payment1.setAmount( payment.getAmount());
	  payment1.setPaymentDate(payment.getPaymentDate());
	  
		return paymentRepository.save(payment1);
	}
	
}
