package com.bilgeadam.entities;

import com.bilgeadam.entities.enums.PaymentStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "payments")
public class Payment extends AbstractEntity {
   private String paypal_payment_id;
   private PaymentStatus status;

}
