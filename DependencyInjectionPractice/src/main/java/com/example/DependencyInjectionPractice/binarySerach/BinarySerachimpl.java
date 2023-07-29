package com.example.DependencyInjectionPractice.binarySerach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySerachimpl {

    @Autowired
    @Qualifier("quickSortAlgorithm")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearch) {
        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

//        search the array
        return 3;
    }

}
