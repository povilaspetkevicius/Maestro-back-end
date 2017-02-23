package com.loanssystem.repositories;

import com.loanssystem.bean.Application;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pov on 17.2.23.
 */
public interface ApplicationsRepository extends CrudRepository<Application,Long>{
}
