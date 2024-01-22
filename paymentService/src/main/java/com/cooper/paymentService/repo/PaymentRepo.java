package com.cooper.paymentService.repo;

import com.cooper.paymentService.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
