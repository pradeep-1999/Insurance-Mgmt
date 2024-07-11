package com.example.demo.Entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Insured_Details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InsuredDetails {

	public String name;

	public int age;

	public String fatherName;

	public String address;

	public String phoneNumber;

	public Character gender;

	public String maritalStatus;

}
