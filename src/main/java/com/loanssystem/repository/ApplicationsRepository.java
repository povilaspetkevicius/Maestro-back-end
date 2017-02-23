package com.loanssystem.repository;

import com.loanssystem.bean.entity.Application;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pov on 17.2.23.
 *
 * Basic Repository used for containing all Applications
 *
 */
public interface ApplicationsRepository extends CrudRepository<Application,Long>{
}
