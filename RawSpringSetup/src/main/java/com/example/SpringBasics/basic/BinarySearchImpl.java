package com.example.SpringBasics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private static final Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("bublick")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        logger.info(sortAlgorithm.toString());
        // Search the array
        return 3;
    }

    @PostConstruct
    public void post() {
        logger.info("postconstruct");
    }

//    @PostConstruct
//    public void postConstruct() {
//        logger.info("postConstruct");
//    }
//
    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }

}
