package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // (1)
@Table(name ="custoemrs") // (2)
@Data
@NoArgsConstructor // (3)
@AllArgsConstructor // (4)
public class Customer {
	@Id // (5)
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
}
