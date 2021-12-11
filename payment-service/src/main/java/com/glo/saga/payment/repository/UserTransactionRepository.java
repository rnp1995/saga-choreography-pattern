package com.glo.saga.payment.repository;

import com.glo.saga.payment.entity.UserTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransactionRepository  extends JpaRepository<UserTransaction,Integer> {
}
