package com.ctl.rxkuma7.multiplemongo;



import com.ctl.rxkuma7.multiplemongo.model.CustomerOrder;
import com.ctl.rxkuma7.multiplemongo.repository.primary.PrimaryRepository;
import com.ctl.rxkuma7.multiplemongo.repository.secondary.SecondaryModel;
import com.ctl.rxkuma7.multiplemongo.repository.secondary.SecondaryRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
public class Application implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	logger.info("************************************************************");
    	logger.info("Start printing mongo objects");
    	logger.info("************************************************************");
  
        List<CustomerOrder> primaries = this.primaryRepository.findByCustomerOrderBysource("LFACS", "2020-09-01T00:00:00.000", "2020-09-02T00:00:00.000");
        logger.info("primary size "+primaries.size());

        logger.info("secondary size "+secondaryRepository.findQualificationCount("2020-09-01T00:00:00.000", "2020-09-02T00:00:00.000", "LFACS"));
       
        logger.info("************************************************************");
        logger.info("Ended printing mongo objects");
        logger.info("************************************************************");

    }
}

