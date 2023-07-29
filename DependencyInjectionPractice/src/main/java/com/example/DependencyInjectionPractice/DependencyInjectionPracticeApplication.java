package com.example.DependencyInjectionPractice;

import com.example.DependencyInjectionPractice.binarySerach.BinarySerachimpl;
import com.example.DependencyInjectionPractice.binarySerach.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionPracticeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(DependencyInjectionPracticeApplication.class, args);
		BinarySerachimpl binarySerachimpl = applicationContext.getBean(BinarySerachimpl.class);

//		BinarySerachimpl binarySerachimpl = new BinarySerachimpl(new QuickSortAlgorithm());
		int result = binarySerachimpl.binarySearch(new int[]{12, 4, 6}, 3);
		System.out.println(result);
	}

}
