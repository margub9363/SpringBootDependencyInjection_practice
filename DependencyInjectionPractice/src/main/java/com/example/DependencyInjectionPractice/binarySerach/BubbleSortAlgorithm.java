package com.example.DependencyInjectionPractice.binarySerach;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Inside BubbleSortAlgorithm");
//        Logic for Quick Sort
        return numbers;
    }
}
