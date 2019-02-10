package com.radchuk.basics.startdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("second")
public class QuickSortAlgorithm implements SortAlgorithm {

    private static final Logger log = LoggerFactory.getLogger(QuickSortAlgorithm.class);

    private final int count;

    public QuickSortAlgorithm(@Autowired @Value("${myapp.count}") int count) {
        this.count = count;
    }

    @Override
    public int[] sort(int[] numbers) {
        log.debug("Running {} with number {}", this.getClass().getName(), count);
        return numbers;
    }
}
