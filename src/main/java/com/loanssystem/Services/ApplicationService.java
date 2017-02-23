package com.loanssystem.Services;

import com.loanssystem.bean.entity.Application;
import com.loanssystem.bean.request.ApplicationRequest;
import com.loanssystem.repositories.ApplicationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pov on 17.2.23.
 *
 * Application Service is used to create new applications and add them
 * to Applications Repository
 *
 *
 */
@Service
public class ApplicationService {
    @Autowired
    private ApplicationsRepository applicationsRepository;

    public void createApplication(ApplicationRequest applicationRequest){
        Application application = new Application();
        application.setId(applicationRequest.getId());
        application.setAmount(applicationRequest.getAmount());
        applicationsRepository.save(application);
    }


}
