package com.example.demo.Entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Previous_Policy_Details")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PreviousPolicyDetails {

	public String policyNumber;

	public String insurerName;

	public boolean Claimed;

	public Integer claimAmount;

	public boolean isNCBAvailed;

	public Integer NCBPercentage;
}
