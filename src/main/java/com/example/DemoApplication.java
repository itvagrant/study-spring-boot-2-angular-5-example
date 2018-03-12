package com.example;


import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.bean.Car;
import com.example.repository.interface1.CarRepository;


@SpringBootApplication()
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(CarRepository carRepository){
		return args->{
			//下面的用法应该是JAVA8新增的Lambda表达式用法
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                    "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name->{
                    	Car car = new Car();
                    	car.setName(name);
                    	carRepository.save(car);
                    });
			carRepository.findAll().forEach(System.out::println);//这是什么用法？
		};
	}
}
