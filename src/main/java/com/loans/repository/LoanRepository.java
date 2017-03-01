package com.loans.repository;

import com.loans.bean.entity.Loan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by pov on 17.2.23.
 *
 * Basic Repository used for containing all Applications
 *
 */
public interface LoanRepository extends CrudRepository<Loan,Integer>{
    public Loan findByCode(String name);
    public List<Loan> findAllByOrderByIdAsc();
    public List<Loan> findAllByOrderBySubmitDateDesc();
    public Loan findByName(String name);
}
