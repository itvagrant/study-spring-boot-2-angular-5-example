package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

@Entity
@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
public class Car {
	@Id @GeneratedValue
	private Long id;
	@NonNull 
	private String name;
	
}
