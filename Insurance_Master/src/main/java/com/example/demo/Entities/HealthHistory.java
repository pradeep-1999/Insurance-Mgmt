package com.example.demo.Entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Health_History")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HealthHistory {

	public String bloodGroup;

	public boolean smoker; // (Y/N)

	public boolean drinker; // (Y/N)

	public String previousHealthIssues; // (if any)

	public String familyMedicalHistory; // (Heart Disease / other hereditary diseases)

	public String bloodTest;
}
