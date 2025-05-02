package com.BankingService.Loans.service;

import com.BankingService.Loans.dto.LoansDto;

public interface ILoanService {
    void createLoan(String mobileNumber);
    LoansDto fetchLoan(String mobileNumber);
    boolean updateLoan(LoansDto loansDto);
    boolean deleteLoan(String mobileNumber);
}
