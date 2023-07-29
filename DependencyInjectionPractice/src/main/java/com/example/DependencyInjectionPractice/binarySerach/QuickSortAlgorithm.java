package com.example.DependencyInjectionPractice.binarySerach;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm{
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Inside QuickSortAlgorithm");
//        Logic for Quick Sort
        return numbers;
    }
}
