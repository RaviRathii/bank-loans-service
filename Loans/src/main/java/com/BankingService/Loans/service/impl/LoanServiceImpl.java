package com.BankingService.Loans.service.impl;

import com.BankingService.Loans.Entity.Loans;
import com.BankingService.Loans.constants.LoanConstant;
import com.BankingService.Loans.dto.LoansDto;
import com.BankingService.Loans.repository.LoanRepository;
import com.BankingService.Loans.service.ILoanService;

import java.util.Optional;
import java.util.Random;

public class LoanServiceImpl implements ILoanService {
    private LoanRepository loanRepository;

    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> optionalLoans = loanRepository.findByMobileNumber(mobileNumber);
        if(optionalLoans.isPresent()){
            throw new RuntimeException();
        }
        Loans newLoan = new Loans();
        long randomNumber = 1000000000 + new Random().nextInt(90000000);
        newLoan.setLoanNumber(Long.toString(randomNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoanConstant.HOME_LOAN);
        newLoan.setTotalLoan(LoanConstant.NEW_LOAN_LIMIT);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(LoanConstant.NEW_LOAN_LIMIT);
        loanRepository.save(newLoan);
    }

    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateLoan(LoansDto loansDto) {
        return false;
    }

    @Override
    public boolean deleteLoan(String mobileNumber) {
        return false;
    }
}
