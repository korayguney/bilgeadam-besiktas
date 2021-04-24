package com.bilgeadam.entities;

import com.bilgeadam.entities.enums.PaymentStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "payments")
public class Payment extends AbstractEntity {
   private String paypal_payment_id;

   @NotNull
   @Enumerated(EnumType.STRING)
   @Column(name = "status", nullable = false)
   private PaymentStatus status;

   @OneToOne
   @JoinColumn(unique = true)
   private Order order;

   public Payment(String paypal_payment_id, @NotNull PaymentStatus status, Order order) {
      this.paypal_payment_id = paypal_payment_id;
      this.status = status;
      this.order = order;
   }
}
