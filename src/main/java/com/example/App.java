package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;

/**
 * JPAエントリポイント
 *
 */
@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// データ追加
		Customer created = customerRepository.save(new Customer(null, "秀敏", "出木杉"));
		System.out.println(created + " is created!");

		// データ表示
		customerRepository.findAllOrderByName().forEach(System.out::println);
	}
}
