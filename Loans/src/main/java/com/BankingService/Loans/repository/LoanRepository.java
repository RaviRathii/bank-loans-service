package com.BankingService.Loans.repository;

import com.BankingService.Loans.Entity.Loans;
import com.BankingService.Loans.dto.ResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loans,Long> {
    Optional<Loans> findByMobileNumber(String mobileNumber);
    Optional<Loans> findByLoanNumber(String loanNumber);
}
