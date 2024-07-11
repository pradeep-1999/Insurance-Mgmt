package com.example.demo.Entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Financial_Details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FinancialDetails {

	public boolean salaried;

	public String salaryRange;

	public Integer numberOfDependents;

	public Integer numberOfCurrentActiveLoans;

}
