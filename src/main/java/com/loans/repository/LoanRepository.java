package com.loans.repository;

import com.loans.bean.entity.Loan;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pov on 17.2.23.
 *
 * Basic Repository used for containing all Applications
 *
 */
public interface LoanRepository extends CrudRepository<Loan,Long>{
    public Iterable<Loan> findByuniqueLoanId(String uniqueLoadId);
}
