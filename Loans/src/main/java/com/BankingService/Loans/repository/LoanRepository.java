package com.BankingService.Loans.repository;

import com.BankingService.Loans.Entity.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loans,Long> {
}
