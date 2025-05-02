package com.BankingService.Loans.controller;

import com.BankingService.Loans.constants.LoanConstant;
import com.BankingService.Loans.dto.LoansDto;
import com.BankingService.Loans.dto.ResponseDto;
import com.BankingService.Loans.service.ILoanService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor @AllArgsConstructor
public class LoanController {
    private ILoanService iLoanService;

    @PostMapping(path = "/create")
    public ResponseEntity<ResponseDto> createLoan(@RequestParam String mobileNumber){
        iLoanService.createLoan(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(LoanConstant.STATUS_200,LoanConstant.MESSAGE_200));
    }

    public ResponseEntity<LoansDto> fetchLoan(@RequestParam String mobileNumber){
         LoansDto loansDto = iLoanService.fetchLoan(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(loansDto);
    }

}
