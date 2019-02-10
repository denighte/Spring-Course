package com.radchuk.basics.startdemo;

import com.radchuk.basics.startdemo.SortAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("first")
public class BubbleSortAlgorithm implements SortAlgorithm {
    private static final Logger log = LoggerFactory.getLogger(BubbleSortAlgorithm.class);

    private final String str;

    public BubbleSortAlgorithm(@Autowired @Value("${myapp.str}") String str) {
        this.str = str;
    }

    @Override
    public int[] sort(int[] numbers) {
        log.debug("Running {} with: {}", this.getClass().getName(), str);
        return numbers;
    }
}
