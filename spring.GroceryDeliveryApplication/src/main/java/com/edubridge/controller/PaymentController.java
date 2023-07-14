package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.Payment;
import com.edubridge.service.PaymentService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	public PaymentController(PaymentService paymentService) {
		this.paymentService=paymentService;
	}
@PostMapping("/{cart_id}/{userId}")
public ResponseEntity<Payment> generatePayment(@PathVariable("cart_id") int cart_id,@PathVariable("userId") int userId,@RequestBody Payment payment){
	System.out.println("inside payment controller");
	Payment payment1 = paymentService.generatePayment(cart_id, userId, payment);
	return new ResponseEntity<Payment>(payment1,HttpStatus.CREATED);
}

@GetMapping()
public List<Payment> getAllPayments(){
	return paymentService.getAllPayments();
}
@GetMapping("/{payment_id}")
public ResponseEntity<Payment> getPaymentById(@PathVariable int payment_id){
	return new ResponseEntity<Payment>(paymentService.getPaymentById(payment_id),HttpStatus.OK);
}
@DeleteMapping("/{payment_id}")
public ResponseEntity<String> cancelPaymentById(@PathVariable int payment_id){
	paymentService.cancelPaymentById(payment_id);
	return new ResponseEntity<String>("Payment cancelled successfully",HttpStatus.OK);
}
@PutMapping("/{payment_id}")
public ResponseEntity<Payment> updatePaymentById(@PathVariable int payment_id,@RequestBody Payment payment){
	return new ResponseEntity<Payment>(paymentService.updatePaymentById(payment_id, payment),HttpStatus.OK);
}





}
