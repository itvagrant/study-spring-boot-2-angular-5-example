package com.example.repository.interface1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.example.bean.Car;
/**
 * JPA:Java Persistence API:Java 持久层API
 * @RepositoryRestResource ：自定义Dao层映射和对应映射文件的关系的注解 
 * @author 祷
 */
@RepositoryRestResource	
@Component
public interface CarRepository extends JpaRepository<Car, Long> {
	
}
